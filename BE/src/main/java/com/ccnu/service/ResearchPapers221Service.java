package com.ccnu.service;

import com.ccnu.pojo.ResearchPapers221;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.dto.IdDto;
import com.ccnu.pojo.vo.ResearchPapers221Vo;
import com.ccnu.utils.PageUtils;

public interface ResearchPapers221Service {
    PageUtils<ResearchPapers221Vo> getAllDoctorPapersInfoBy221(DoctorInfosQueryDto dto);

    Boolean addPapersInfoBy221(ResearchPapers221 researchPapers221);

    ResearchPapers221 updatePapersInfoBy221(ResearchPapers221 researchPapers221);

    Boolean deletePapersInfoBy221(Integer id);

    ResearchPapers221 getDoctorPapersInfoBy221(IdDto idDto);
}
