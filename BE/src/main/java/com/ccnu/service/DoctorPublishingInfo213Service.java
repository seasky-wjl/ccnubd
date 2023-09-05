package com.ccnu.service;

import com.ccnu.pojo.PublishingTextbookSituation213;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.dto.IdDto;
import com.ccnu.pojo.vo.PublishingTextbookSituation213Vo;
import com.ccnu.utils.PageUtils;

public interface DoctorPublishingInfo213Service {
    PageUtils<PublishingTextbookSituation213Vo> getAllDoctorPublishingInfoBy213(DoctorInfosQueryDto doctorInfosQueryDto);

    Boolean addPublishingInfoBy213(PublishingTextbookSituation213 publishingTextbookSituation213);

    PublishingTextbookSituation213 updatePublishingInfoBy213(PublishingTextbookSituation213 publishingTextbookSituation213);

    Boolean deletePublishingInfoBy213(Integer id);

    PublishingTextbookSituation213 getDoctorPublishingInfoBy213(IdDto idDto);
}
