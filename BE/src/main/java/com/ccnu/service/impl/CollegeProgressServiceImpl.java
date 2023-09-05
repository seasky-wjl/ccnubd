package com.ccnu.service.impl;

import com.ccnu.mapper.ConfirmInformationMapper;
import com.ccnu.mapper.UserAccountMapper;
import com.ccnu.mapper.UserStatusMapper;
import com.ccnu.pojo.*;
import com.ccnu.pojo.ConfirmInformationExample.Criteria;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.vo.CollegeProgressVo;
import com.ccnu.pojo.vo.CollegeStatisticsVo;
import com.ccnu.service.CollegeProgressService;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class CollegeProgressServiceImpl implements CollegeProgressService {

    @Autowired
    UserAccountMapper userAccountMapper;

    @Autowired
    ConfirmInformationMapper confirmInformationMapper;

    @Autowired
    private UserStatusMapper userStatusMapper;

    @Override
    public CollegeStatisticsVo collegePopulationStatistics(DoctorInfosQueryDto doctorInfosQueryDto) {
        CollegeStatisticsVo vo = new CollegeStatisticsVo();
        //筛选出在岗的博导
        UserStatusExample userStatusExample = new UserStatusExample();
        userStatusExample.createCriteria().andWorkStatusEqualTo("1");
        List<UserStatus> notOnWork = userStatusMapper.selectByExample(userStatusExample);

        UserAccountExample userAccountExample = new UserAccountExample();
        UserAccountExample userAccountExample1 = new UserAccountExample();
        UserAccountExample.Criteria userAccountCriteria = userAccountExample.createCriteria();
        UserAccountExample.Criteria criteria1 = userAccountExample1.createCriteria();
        if(StringUtils.isNotBlank(doctorInfosQueryDto.getCollege())){
            userAccountCriteria.andFacultyCodeEqualTo(doctorInfosQueryDto.getCollege());
        }
        if(notOnWork != null || notOnWork.size() > 0){
            List<Integer> ids = notOnWork.stream().map(item -> item.getUserId()).collect(Collectors.toList());
            userAccountCriteria.andIdNotIn(ids);

            //不在岗的博导唯一识别码
            criteria1.andIdIn(ids);
        }
        userAccountCriteria.andRoleEqualTo(4);

        List<UserAccount> userAccountList = userAccountMapper.selectByExample(userAccountExample);
        List<UserAccount> userAccounts1 = userAccountMapper.selectByExample(userAccountExample1);

        // 学院人数
        int numberAcademy;
        if(userAccountList == null){
            numberAcademy = 0;
        }else {
            numberAcademy = userAccountList.size();
        }
        vo.setNumberAcademy(numberAcademy);

        // 学院提交人数
        ConfirmInformationExample confirmInformationExample = new ConfirmInformationExample();
        Criteria criteria2 = confirmInformationExample.createCriteria();
        //筛选在岗的并且总体确认成功的博导确认数据
        if(userAccounts1 != null && userAccounts1.size() > 0){
            List<String> tutorIds = userAccounts1.stream().map(item -> item.getUsername()).collect(Collectors.toList());
            criteria2.andTutorIdentificationCodeNotIn(tutorIds);
        }
        criteria2.andTotalConfirmEqualTo("1");
        List<ConfirmInformation> confirmInformation = confirmInformationMapper.selectByExample(confirmInformationExample);

        int numberSubmissions=0;
        for (int i=0;i<userAccountList.size();i++){
            String code_i = userAccountList.get(i).getUsername();
            for (int j=0;j<confirmInformation.size();j++){
                String code_j = confirmInformation.get(j).getTutorIdentificationCode();
                if (code_i.equals(code_j)){
                    numberSubmissions++;
                    break;
                }
            }
        }
        vo.setNumberSubmissions(numberSubmissions);

        // 学院未提交人数
        int numberUnsubmissions;
        numberUnsubmissions = numberAcademy - numberSubmissions;
        if(numberUnsubmissions < 0){
            numberUnsubmissions = 0;
        }
        vo.setNumberUnsubmissions(numberUnsubmissions);

        // 学院提交进度
        double overallProgressPercentage;
        if(numberAcademy == 0){
            overallProgressPercentage = 0;
        }else {
            overallProgressPercentage = ((double)numberSubmissions)/numberAcademy;
        }
        vo.setOverallProgressPercentage(overallProgressPercentage);

        return vo;
    }

    @Override
    public List<CollegeProgressVo> collegeOverallProgressList(DoctorInfosQueryDto doctorInfosQueryDto) {
        List<CollegeProgressVo> voList = new ArrayList<>();

        UserAccountExample userAccountExample = new UserAccountExample();
        UserAccountExample.Criteria userAccountCriteria = userAccountExample.createCriteria();
        if(StringUtils.isNotBlank(doctorInfosQueryDto.getCollege())){
            userAccountCriteria.andFacultyCodeEqualTo(doctorInfosQueryDto.getCollege());
        }
        userAccountCriteria.andRoleEqualTo(4);

        List<UserAccount> userAccountList = userAccountMapper.selectByExample(userAccountExample);


        for (int i=0;i<userAccountList.size();i++){
            CollegeProgressVo vo = new CollegeProgressVo();

            ConfirmInformationExample confirmInformationExample = new ConfirmInformationExample();
            confirmInformationExample.createCriteria().andTutorIdentificationCodeEqualTo(userAccountList.get(i).getUsername());
            List<ConfirmInformation> confirmInformation = confirmInformationMapper.selectByExample(confirmInformationExample);
            if (confirmInformation.size()==0) {
                vo.setTutorIdentificationCode(userAccountList.get(i).getUsername());
                vo.setPercentageProgress("0");
                vo.setSubmissionTime("暂未提交");
                vo.setName(userAccountList.get(i).getRealname());
                voList.add(vo);
                continue;
            }

            int total = Integer.parseInt(confirmInformation.get(0).getTableConfirm111()) +
                    Integer.parseInt(confirmInformation.get(0).getTableConfirm111xu1()) +
                    Integer.parseInt(confirmInformation.get(0).getTableConfirm111xu2()) +
                    Integer.parseInt(confirmInformation.get(0).getTableConfirm112()) +
                    Integer.parseInt(confirmInformation.get(0).getTableConfirm121()) +
                    Integer.parseInt(confirmInformation.get(0).getTableConfirm211()) +
                    Integer.parseInt(confirmInformation.get(0).getTableConfirm212()) +
                    Integer.parseInt(confirmInformation.get(0).getTableConfirm213()) +
                    Integer.parseInt(confirmInformation.get(0).getTableConfirm214()) +
                    Integer.parseInt(confirmInformation.get(0).getTableConfirm215()) +
                    Integer.parseInt(confirmInformation.get(0).getTableConfirm221()) +
                    Integer.parseInt(confirmInformation.get(0).getTableConfirm222()) +
                    Integer.parseInt(confirmInformation.get(0).getTableConfirm223()) +
                    Integer.parseInt(confirmInformation.get(0).getTableConfirm224()) +
                    Integer.parseInt(confirmInformation.get(0).getTableConfirm225()) +
                    Integer.parseInt(confirmInformation.get(0).getTableConfirm226()) +
                    Integer.parseInt(confirmInformation.get(0).getTableConfirm227());

            NumberFormat numberFormat = NumberFormat.getInstance();
            // 设置精确到小数点后2位
            numberFormat.setMaximumFractionDigits(2);
            String percentageProgress = numberFormat.format((float) total / (float) 17 * 100);

            vo.setTutorIdentificationCode(userAccountList.get(i).getUsername());
            vo.setPercentageProgress(percentageProgress);
            vo.setSubmissionTime(confirmInformation.get(0).getTotalTime());
            vo.setName(userAccountList.get(i).getRealname());

            voList.add(vo);
        }
        return voList;
    }


}
