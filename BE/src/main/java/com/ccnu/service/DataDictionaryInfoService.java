package com.ccnu.service;

import com.ccnu.pojo.DataDictionary;
import com.ccnu.pojo.DataDictionaryType;
import com.ccnu.pojo.dto.DictionaryDto;

import java.util.List;

/**
 * @author 王新强
 * @version 1.0
 * @date 2020/12/31 11:43
 */
public interface DataDictionaryInfoService {

    public List<DataDictionary> getDataDictionaryInfo(DictionaryDto dictionaryDto);

}
