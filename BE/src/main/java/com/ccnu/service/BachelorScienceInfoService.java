package com.ccnu.service;


import com.ccnu.pojo.BachelorScience;
import com.ccnu.pojo.dto.DictionaryDto;

import java.util.List;

public interface BachelorScienceInfoService {
    public List<BachelorScience> getBachelorScienceInfo(DictionaryDto dictionaryDto);
}
