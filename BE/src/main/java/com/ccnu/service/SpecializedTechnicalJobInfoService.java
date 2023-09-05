package com.ccnu.service;


import com.ccnu.pojo.SpecializedTechnicalJob;
import com.ccnu.pojo.dto.DictionaryDto;

import java.util.List;

public interface SpecializedTechnicalJobInfoService {
    public List<SpecializedTechnicalJob> getSpecializedTechnicalJobInfo(DictionaryDto dictionaryDto);
}
