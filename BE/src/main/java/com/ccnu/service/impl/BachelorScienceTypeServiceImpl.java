package com.ccnu.service.impl;

import com.ccnu.mapper.BachelorScienceMapper;
import com.ccnu.pojo.BachelorScience;
import com.ccnu.pojo.BachelorScienceExample;
import com.ccnu.pojo.DataDictionary;
import com.ccnu.pojo.dto.DictionaryDto;
import com.ccnu.service.BachelorScienceTypeService;
import com.ccnu.utils.AppException;
import com.ccnu.utils.ErrorCode;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 王新强
 * @version 1.0
 * @date 2020/12/31 11:59
 */
@Service
public class BachelorScienceTypeServiceImpl implements BachelorScienceTypeService {

    @Autowired
    BachelorScienceMapper bachelorScienceMapper;

    @Override
    public List<BachelorScience> getBachelorScienceType(DictionaryDto dictionaryDto) {
        BachelorScienceExample example=new BachelorScienceExample();
        BachelorScienceExample.Criteria criteria=example.createCriteria();

        String s=""+dictionaryDto.getId_type();
        if(StringUtils.isNotBlank(s))
        {
            criteria.andIdTypeEqualTo(dictionaryDto.getId_type());

        }
        List<BachelorScience>bachelorSciences=bachelorScienceMapper.selectByExample(example);
        if(bachelorSciences == null || bachelorSciences.size() < 1){
            return null;
        }

        return bachelorSciences;
    }
}
