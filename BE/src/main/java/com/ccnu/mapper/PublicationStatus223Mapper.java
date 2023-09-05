package com.ccnu.mapper;

import com.ccnu.pojo.PublicationStatus223;
import com.ccnu.pojo.PublicationStatus223Example;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.vo.PublicationStatus223Vo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PublicationStatus223Mapper {
    /**
     *
     * @mbggenerated 2020-12-21
     */
    int countByExample(PublicationStatus223Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int deleteByExample(PublicationStatus223Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int insert(PublicationStatus223 record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int insertSelective(PublicationStatus223 record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    List<PublicationStatus223> selectByExample(PublicationStatus223Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    PublicationStatus223 selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByExampleSelective(@Param("record") PublicationStatus223 record, @Param("example") PublicationStatus223Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByExample(@Param("record") PublicationStatus223 record, @Param("example") PublicationStatus223Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByPrimaryKeySelective(PublicationStatus223 record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByPrimaryKey(PublicationStatus223 record);

    List<PublicationStatus223Vo> getAllDoctorPublicationInfoBy223(DoctorInfosQueryDto doctorInfosQueryDto);
}