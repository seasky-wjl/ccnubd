package com.ccnu.service.impl;

import com.ccnu.mapper.ConfirmInformationMapper;
import com.ccnu.mapper.DataDictionaryMapper;
import com.ccnu.mapper.DataDictionaryTypeMapper;
import com.ccnu.mapper.UserAccountMapper;
import com.ccnu.mapper.UserStatusMapper;
import com.ccnu.pojo.ConfirmInformation;
import com.ccnu.pojo.ConfirmInformationExample;
import com.ccnu.pojo.DataDictionary;
import com.ccnu.pojo.DataDictionaryExample;
import com.ccnu.pojo.DataDictionaryType;
import com.ccnu.pojo.DataDictionaryTypeExample;
import com.ccnu.pojo.UserAccount;
import com.ccnu.pojo.UserAccountExample;
import com.ccnu.pojo.UserAccountExample.Criteria;
import com.ccnu.pojo.UserStatus;
import com.ccnu.pojo.UserStatusExample;
import com.ccnu.pojo.vo.GraduateSchoolProgressVo;
import com.ccnu.pojo.vo.GraduateSchoolStatisticsVo;
import com.ccnu.service.GraduateSchoolStatisticsService;
import com.ccnu.utils.AppException;
import com.ccnu.utils.ErrorCode;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: ccnu-bd
 * @description:
 * @author: lsc
 * @create: 2021-01-04 10:05
 **/
@Service
public class GraduateSchoolStatisticsServiceImpl implements GraduateSchoolStatisticsService {

    @Autowired
    private ConfirmInformationMapper confirmInformationMapper;
    @Autowired
    private DataDictionaryMapper dataDictionaryMapper;
    @Autowired
    private DataDictionaryTypeMapper dataDictionaryTypeMapper;
    @Autowired
    private UserStatusMapper userStatusMapper;
    @Autowired
    private UserAccountMapper userAccountMapper;

    @Override
    public GraduateSchoolStatisticsVo getGraduateSchoolStatistics() {
        GraduateSchoolStatisticsVo vo = new GraduateSchoolStatisticsVo();
        //筛选出在岗的博导
        UserStatusExample userStatusExample = new UserStatusExample();
        userStatusExample.createCriteria().andWorkStatusEqualTo("1");
        List<UserStatus> notOnWork = userStatusMapper.selectByExample(userStatusExample);
        List<Integer> ids;
        UserAccountExample userAccountExample = new UserAccountExample();
        UserAccountExample userAccountExample1 = new UserAccountExample();
        Criteria criteria = userAccountExample.createCriteria();
        Criteria criteria1 = userAccountExample1.createCriteria();
        if(notOnWork != null && notOnWork.size() > 0){
            ids = notOnWork.stream().map(UserStatus::getUserId).collect(Collectors.toList());
            criteria.andIdNotIn(ids);

            //不在岗的博导唯一识别码
            criteria1.andIdIn(ids);
        }
        criteria.andRoleEqualTo(4);

        List<UserAccount> userAccounts = userAccountMapper.selectByExample(userAccountExample);
        List<UserAccount> userAccounts1 = userAccountMapper.selectByExample(userAccountExample1);
        //博导人数
        int graduateNumberAcademy;
        if(userAccounts == null || userAccounts.size() < 1){
            graduateNumberAcademy = 0;
        }else {
            graduateNumberAcademy = userAccounts.size();
        }
        System.out.println(graduateNumberAcademy);
        vo.setGraduateNumberAcademy(graduateNumberAcademy);
        ConfirmInformationExample confirmInformationExample = new ConfirmInformationExample();
        ConfirmInformationExample.Criteria criteria2 = confirmInformationExample.createCriteria();
        //筛选在岗的并且总体确认成功的博导确认数据
        if(userAccounts1 != null && userAccounts1.size() > 0){
            List<String> tutorIds = userAccounts1.stream().map(item -> item.getUsername()).collect(Collectors.toList());
            criteria2.andTutorIdentificationCodeNotIn(tutorIds);
        }
        criteria2.andTotalConfirmEqualTo("1");
        List<ConfirmInformation> confirmInformations = confirmInformationMapper.selectByExample(confirmInformationExample);
        //总提交人数
        int graduateNumberSubmissions;
        if(confirmInformations == null || confirmInformations.size() < 1){
            graduateNumberSubmissions = 0;
        }else {
            graduateNumberSubmissions = confirmInformations.size();
        }
        vo.setGraduateNumberSubmissions(graduateNumberSubmissions);
        //未提交人数
        int graduateNumberUnsubmissions;
        graduateNumberUnsubmissions = graduateNumberAcademy - graduateNumberSubmissions;
        if(graduateNumberUnsubmissions < 0){
            graduateNumberUnsubmissions = 0;
        }
        vo.setGraduateNumberUnsubmissions(graduateNumberUnsubmissions);
        //整体百分比
        double graduateOverallProgressPercentage;
        if(graduateNumberAcademy == 0){
            graduateOverallProgressPercentage = 0;
        }else {
            graduateOverallProgressPercentage = ((double)graduateNumberSubmissions)/graduateNumberAcademy;
        }
        vo.setGraduateOverallProgressPercentage(graduateOverallProgressPercentage);
        return vo;
    }

    @Override
    public List<GraduateSchoolProgressVo> getGraduateSchoolProgress() {
        List<GraduateSchoolProgressVo> voList = new ArrayList<>();
        DataDictionaryTypeExample dataDictionaryTypeExample = new DataDictionaryTypeExample();
        dataDictionaryTypeExample.createCriteria().andTypenameEqualTo("学院");
        List<DataDictionaryType> dataDictionaryTypes = dataDictionaryTypeMapper.selectByExample(dataDictionaryTypeExample);
        if(dataDictionaryTypes == null || dataDictionaryTypes.size() < 1){
            throw new AppException(ErrorCode.NOT_EXIST);
        }
        String typeCode = dataDictionaryTypes.get(0).getTypecode();
        DataDictionaryExample dataDictionaryExample = new DataDictionaryExample();
        dataDictionaryExample.createCriteria().andDataTypeEqualTo(typeCode);
        //学院列表
        List<DataDictionary> collegeList = dataDictionaryMapper.selectByExample(dataDictionaryExample);
        if(collegeList == null){
            throw new AppException(ErrorCode.NOT_EXIST,"请添加学院字典信息!");
        }
        //筛选出在岗的博导
        UserStatusExample userStatusExample = new UserStatusExample();
        UserAccountExample userAccountExample1 = new UserAccountExample();
        userStatusExample.createCriteria().andWorkStatusEqualTo("1");
        List<UserStatus> notOnWork = userStatusMapper.selectByExample(userStatusExample);
        List<Integer> ids = new ArrayList<>();
        UserAccountExample userAccountExample = new UserAccountExample();
        Criteria criteria = userAccountExample.createCriteria();
        Criteria criteria1 = userAccountExample1.createCriteria();
        if(notOnWork != null && notOnWork.size() > 0){
            ids = notOnWork.stream().map(item -> item.getUserId()).collect(Collectors.toList());
            criteria.andIdNotIn(ids);

            //不在岗的博导唯一识别码
            criteria1.andIdIn(ids);
        }
        criteria.andRoleEqualTo(4);

        List<UserAccount> userAccounts = userAccountMapper.selectByExample(userAccountExample);
        List<UserAccount> userAccounts1 = userAccountMapper.selectByExample(userAccountExample1);
        ConfirmInformationExample confirmInformationExample = new ConfirmInformationExample();
        ConfirmInformationExample.Criteria criteria2 = confirmInformationExample.createCriteria();
        //筛选在岗的并且总体确认成功的博导确认数据
        if(userAccounts1 != null && userAccounts1.size() > 0){
            List<String> tutorIds = userAccounts1.stream().map(item -> item.getUsername()).collect(Collectors.toList());
            criteria2.andTutorIdentificationCodeNotIn(tutorIds);
        }
        criteria2.andTotalConfirmEqualTo("1");
        List<ConfirmInformation> confirmInformations = confirmInformationMapper.selectByExample(confirmInformationExample);
        for(int i = 0; i < collegeList.size(); i++){
            double percentageProgress = 0;
            GraduateSchoolProgressVo vo = new GraduateSchoolProgressVo();
            vo.setCollege(collegeList.get(i).getDataValue());
            vo.setTutorIdentificationCode(collegeList.get(i).getDataCode());
            if(userAccounts != null && userAccounts.size() > 1){
                //当前学院所有导师的唯一识别码
                int finalI = i;
                List<String> doctorCodes = userAccounts.stream().filter(item -> item.getFaculty().equals(collegeList.get(
                        finalI).getDataValue())).map(item -> item.getUsername()).collect(Collectors.toList());
                if(doctorCodes != null && doctorCodes.size() > 1){
                    //当前学院已确定人数
                    long confirms = confirmInformations.stream().filter(item -> item.getTotalConfirm().equals("1")).filter(item -> doctorCodes.contains(item.getTutorIdentificationCode())).count();
                    percentageProgress = (confirms * 1.0)/doctorCodes.size();
                }
            }
            vo.setPercentageProgress(percentageProgress);
            voList.add(vo);
        }
        return voList;
    }
}
