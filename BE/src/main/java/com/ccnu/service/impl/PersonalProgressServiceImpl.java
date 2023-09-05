package com.ccnu.service.impl;

import com.ccnu.mapper.ConfirmInformationMapper;
import com.ccnu.mapper.UserAccountMapper;
import com.ccnu.pojo.ConfirmInformation;
import com.ccnu.pojo.ConfirmInformationExample;
import com.ccnu.pojo.UserAccount;
import com.ccnu.pojo.UserAccountExample;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.vo.DoctorProgressVo;
import com.ccnu.service.PersonalProgressService;
import com.ccnu.utils.AppException;
import com.ccnu.utils.ErrorCode;
import com.ccnu.utils.PageUtils;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import java.util.ArrayList;
import java.util.Optional;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 王新强
 * @version 1.0
 * @date 2020/12/31 15:34
 */
@Service
public class PersonalProgressServiceImpl implements PersonalProgressService {

    @Autowired
    ConfirmInformationMapper confirmInformationMapper;
    @Autowired
    private UserAccountMapper userAccountMapper;

    @Override
    public List<ConfirmInformation> PersonalProgress(DoctorInfosQueryDto doctorInfosQueryDto) {
        ConfirmInformationExample example=new ConfirmInformationExample();
        ConfirmInformationExample.Criteria criteria=example.createCriteria();

        System.out.println(doctorInfosQueryDto.getTutorIdentificationCode());
        if (StringUtils.isNotBlank(doctorInfosQueryDto.getTutorIdentificationCode()))
        {
            criteria.andTutorIdentificationCodeEqualTo(doctorInfosQueryDto.getTutorIdentificationCode());
        }
        List<ConfirmInformation>confirmInformations =confirmInformationMapper.selectByExample(example);
        return confirmInformations;
    }

    @Override
    public PageUtils<DoctorProgressVo> getAllDoctorsProgess(DoctorInfosQueryDto dto) {
        List<DoctorProgressVo> voList = new ArrayList<>();
        Page<UserAccount> page = PageHelper.startPage(dto.getPageNo(),dto.getPageSize());
        UserAccountExample userAccountExample = new UserAccountExample();
        UserAccountExample.Criteria userAccountCriteria = userAccountExample.createCriteria();
        if(dto != null && StringUtils.isNotBlank(dto.getCollege())){
            userAccountCriteria.andFacultyCodeEqualTo(dto.getCollege());
        }
        if(dto != null && StringUtils.isNotBlank(dto.getTutorIdentificationCode())){
            userAccountCriteria.andUsernameEqualTo(dto.getTutorIdentificationCode());
        }
        //筛选只属于博导的数据进行统计
        userAccountCriteria.andRoleEqualTo(4);

        List<UserAccount> doctorsInfo = userAccountMapper.selectByExample(userAccountExample);
        if(doctorsInfo == null || doctorsInfo.size() < 1){
            throw new AppException(ErrorCode.NOT_EXIST);
        }
        ConfirmInformationExample confirmInformationExample = new ConfirmInformationExample();
        List<ConfirmInformation> confirmInformations = confirmInformationMapper.selectByExample(confirmInformationExample);
        for(int i = 0; i < doctorsInfo.size(); i++){
            DoctorProgressVo vo = new DoctorProgressVo();
            vo.setCollege(doctorsInfo.get(i).getFaculty());
            vo.setRealName(doctorsInfo.get(i).getRealname());
            vo.setTutorIdentificationCode(doctorsInfo.get(i).getUsername());
            if(confirmInformations == null || confirmInformations.size() < 1){
                vo.setDoctorProgress(0.0);
                vo.setTotalTime(null);
            }else {
                int finalI = i;
                Optional<ConfirmInformation> confirmInformation = confirmInformations.stream().filter(item -> item.getTutorIdentificationCode().equals(doctorsInfo.get(
                        finalI).getUsername())).findFirst();
                if(confirmInformation.isPresent()){
                    vo.setTotalTime(confirmInformation.get().getTotalTime());
                    int j = judgConfirmNum(confirmInformation.get());
                    vo.setDoctorProgress(j/17.0);
                }else {
                    vo.setDoctorProgress(0.0);
                    vo.setTotalTime(null);
                }
            }
            voList.add(vo);
        }
        PageUtils<DoctorProgressVo> pageUtils = new PageUtils<>(page.getPageNum(), page.getPageSize(),
                page.getTotal(), voList);
        return pageUtils;
    }

    private int judgConfirmNum(ConfirmInformation confirmInformation){
        int i = 0;
        if(confirmInformation.getTableConfirm111().equals("1")){
            i = i + 1;
        }
        if(confirmInformation.getTableConfirm111xu1().equals("1")){
            i = i + 1;
        }
        if(confirmInformation.getTableConfirm111xu2().equals("1")){
            i = i + 1;
        }
        if(confirmInformation.getTableConfirm112().equals("1")){
            i = i + 1;
        }
        if(confirmInformation.getTableConfirm121().equals("1")){
            i = i + 1;
        }
        if(confirmInformation.getTableConfirm211().equals("1")){
            i = i + 1;
        }
        if(confirmInformation.getTableConfirm212().equals("1")){
            i = i + 1;
        }
        if(confirmInformation.getTableConfirm213().equals("1")){
            i = i + 1;
        }
        if(confirmInformation.getTableConfirm214().equals("1")){
            i = i + 1;
        }
        if(confirmInformation.getTableConfirm215().equals("1")){
            i = i + 1;
        }
        if(confirmInformation.getTableConfirm221().equals("1")){
            i = i + 1;
        }
        if(confirmInformation.getTableConfirm222().equals("1")){
            i = i + 1;
        }
        if(confirmInformation.getTableConfirm223().equals("1")){
            i = i + 1;
        }
        if(confirmInformation.getTableConfirm224().equals("1")){
            i = i + 1;
        }
        if(confirmInformation.getTableConfirm225().equals("1")){
            i = i + 1;
        }
        if(confirmInformation.getTableConfirm226().equals("1")){
            i = i + 1;
        }
        if(confirmInformation.getTableConfirm227().equals("1")){
            i = i + 1;
        }
        return i;
    }
}
