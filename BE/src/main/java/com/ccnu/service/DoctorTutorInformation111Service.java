package com.ccnu.service;

import com.ccnu.pojo.DoctorTutorInformation111;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.dto.IdDto;
import com.ccnu.utils.PageUtils;

/**
 * @author 王新强
 * @version 1.0
 * @date 2020/12/4 13:46
 */
public interface DoctorTutorInformation111Service {

    /**
     * 分页查询所有博导信息
     * @param doctorInfosQueryDto
     * @return
     */
    PageUtils<DoctorTutorInformation111> getAllDoctorsInfoBy111(DoctorInfosQueryDto doctorInfosQueryDto);

    /**
     * 新增表111博导信息
     * @param doctorTutorInformation111
     * @return
     */
    Boolean addDoctorsInfoBy111(DoctorTutorInformation111 doctorTutorInformation111);

    /**
     * 修改表111博导信息
     * @param doctorTutorInformation111
     * @return
     */
    DoctorTutorInformation111 updateDoctorsInfoBy111(DoctorTutorInformation111 doctorTutorInformation111);

    /**
     * 删除表111博导信息(软删除)
     * @param id
     * @return
     */
    Boolean deleteDoctorsInfoBy111(Integer id);

    DoctorTutorInformation111 getDoctorsInfoBy111(DoctorTutorInformation111 doctorTutorInformation111);
}
