package com.ccnu.service;

import com.ccnu.pojo.ConfirmInformation;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;

import com.ccnu.pojo.dto.TutorIdentificationCodeDto;
import com.ccnu.pojo.vo.DoctorProgressVo;
import com.ccnu.utils.PageUtils;
import java.util.List;

/**
 * @author 王新强
 * @version 1.0
 * @date 2020/12/31 15:34
 */
public interface PersonalProgressService {


    public List<ConfirmInformation> PersonalProgress(DoctorInfosQueryDto doctorInfosQueryDto);

    PageUtils<DoctorProgressVo> getAllDoctorsProgess(DoctorInfosQueryDto dto);

}
