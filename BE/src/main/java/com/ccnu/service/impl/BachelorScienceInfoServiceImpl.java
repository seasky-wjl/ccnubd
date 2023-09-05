package com.ccnu.service.impl;

import com.ccnu.mapper.BachelorScienceMapper;
import com.ccnu.pojo.BachelorScience;
import com.ccnu.pojo.BachelorScienceExample;
import com.ccnu.pojo.dto.DictionaryDto;
import com.ccnu.service.BachelorScienceInfoService;
import com.ccnu.utils.AppException;
import com.ccnu.utils.ErrorCode;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BachelorScienceInfoServiceImpl implements BachelorScienceInfoService {

    @Autowired
    BachelorScienceMapper bachelorScienceMapper;

    @Override
    public List<BachelorScience> getBachelorScienceInfo(DictionaryDto dictionaryDto) {
        BachelorScienceExample example=new BachelorScienceExample();
        BachelorScienceExample.Criteria criteria=example.createCriteria();


//
//        if(StringUtils.isNotBlank(dictionaryDto.getId_type()){
//            criteria.andBachelorScienceEqualTo(dictionaryDto.getId_type());
//
//        }
        List<BachelorScience> bachelorSciences=bachelorScienceMapper.selectByExample(example);
        if(bachelorSciences == null || bachelorSciences.size() < 1){
            return null;
        }

        return bachelorSciences;
    }
}
