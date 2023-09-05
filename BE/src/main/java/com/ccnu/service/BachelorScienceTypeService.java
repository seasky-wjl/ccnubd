package com.ccnu.service;

import com.ccnu.pojo.BachelorScience;
import com.ccnu.pojo.dto.DictionaryDto;

import java.util.List;

/**
 * @author 王新强
 * @version 1.0
 * @date 2020/12/31 11:59
 */
public interface BachelorScienceTypeService {

    public List<BachelorScience>getBachelorScienceType(DictionaryDto dictionaryDto);

}
