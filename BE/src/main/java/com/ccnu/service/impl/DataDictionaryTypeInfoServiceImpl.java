package com.ccnu.service.impl;

import com.ccnu.mapper.DataDictionaryTypeMapper;
import com.ccnu.pojo.DataDictionaryType;
import com.ccnu.pojo.DataDictionaryTypeExample;
import com.ccnu.pojo.DoctorTutorInformation111Xu1;
import com.ccnu.pojo.DoctorTutorInformation111Xu1Example;
import com.ccnu.pojo.dto.DictionaryDto;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.service.DataDictionaryTypeInfoService;
import com.ccnu.utils.AppException;
import com.ccnu.utils.ErrorCode;
import com.ccnu.utils.PageUtils;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 王新强
 * @version 1.0
 * @date 2020/12/29 12:52
 */
@Service
public class DataDictionaryTypeInfoServiceImpl implements DataDictionaryTypeInfoService {

    @Autowired
    DataDictionaryTypeMapper dataDictionaryTypeMapper;



    @Override
    public List<DataDictionaryType> getDataDictionaryTypeInfo(DictionaryDto dictionaryDto) {

        DataDictionaryTypeExample example=new DataDictionaryTypeExample();
        DataDictionaryTypeExample.Criteria criteria=example.createCriteria();
        if(StringUtils.isNotBlank(dictionaryDto.getTypename())){
            criteria.andTypenameEqualTo(dictionaryDto.getTypename());

        }
        List<DataDictionaryType> dataDictionaryTypes=dataDictionaryTypeMapper.selectByExample(example);
        if(dataDictionaryTypes == null || dataDictionaryTypes.size() < 1){
            return null;
        }

        return dataDictionaryTypes;


    }



}
