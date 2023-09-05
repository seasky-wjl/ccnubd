package com.ccnu.mapper;

import com.ccnu.pojo.PublishingTextbookSituation213;
import com.ccnu.pojo.PublishingTextbookSituation213Example;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.vo.PublishingTextbookSituation213Vo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PublishingTextbookSituation213Mapper {
    /**
     *
     * @mbggenerated 2020-12-21
     */
    int countByExample(PublishingTextbookSituation213Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int deleteByExample(PublishingTextbookSituation213Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int insert(PublishingTextbookSituation213 record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int insertSelective(PublishingTextbookSituation213 record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    List<PublishingTextbookSituation213> selectByExample(PublishingTextbookSituation213Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    PublishingTextbookSituation213 selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByExampleSelective(@Param("record") PublishingTextbookSituation213 record, @Param("example") PublishingTextbookSituation213Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByExample(@Param("record") PublishingTextbookSituation213 record, @Param("example") PublishingTextbookSituation213Example example);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByPrimaryKeySelective(PublishingTextbookSituation213 record);

    /**
     *
     * @mbggenerated 2020-12-21
     */
    int updateByPrimaryKey(PublishingTextbookSituation213 record);

    List<PublishingTextbookSituation213Vo> getAllDoctorPublishingInfoBy213(DoctorInfosQueryDto doctorInfosQueryDto);
}