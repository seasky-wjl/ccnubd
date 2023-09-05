package com.ccnu.service.impl;

import com.ccnu.mapper.DataDictionaryMapper;
import com.ccnu.pojo.DataDictionary;
import com.ccnu.pojo.DataDictionaryExample;
import com.ccnu.pojo.DataDictionaryType;
import com.ccnu.pojo.DataDictionaryTypeExample;
import com.ccnu.pojo.dto.DictionaryDto;
import com.ccnu.service.DataDictionaryInfoService;
import com.ccnu.utils.AppException;
import com.ccnu.utils.ErrorCode;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 王新强
 * @version 1.0
 * @date 2020/12/31 11:43
 */
@Service
public class DataDictionaryInfoServiceImpl implements DataDictionaryInfoService {

    @Autowired
    DataDictionaryMapper dataDictionaryMapper;

    @Override
    public List<DataDictionary> getDataDictionaryInfo(DictionaryDto dictionaryDto) {
        DataDictionaryExample example=new DataDictionaryExample();
        DataDictionaryExample.Criteria criteria=example.createCriteria();
        if(StringUtils.isNotBlank(dictionaryDto.getDatatype()))
        {
            criteria.andDataTypeEqualTo(dictionaryDto.getDatatype());
        }
        //升序展示
        example.setOrderByClause("id ASC");
        List<DataDictionary>dataDictionaries=dataDictionaryMapper.selectByExample(example);

        if(dataDictionaries == null || dataDictionaries.size() < 1){
            return null;
        }

        return dataDictionaries;


    }
}
