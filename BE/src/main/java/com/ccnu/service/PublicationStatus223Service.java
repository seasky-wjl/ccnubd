package com.ccnu.service;

import com.ccnu.pojo.PublicationStatus223;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.dto.IdDto;
import com.ccnu.pojo.vo.PublicationStatus223Vo;
import com.ccnu.utils.PageUtils;

public interface PublicationStatus223Service {
    PageUtils<PublicationStatus223Vo> getAllDoctorPublicationInfoBy223(DoctorInfosQueryDto dto);

    Boolean addPublicationInfoBy223(PublicationStatus223 publicationStatus223);

    PublicationStatus223 updatePublicationInfoBy223(PublicationStatus223 publicationStatus223);

    Boolean deletePublicationInfoBy223(Integer id);

    PublicationStatus223 getDoctorPublicationInfoBy223(IdDto idDto);
}
