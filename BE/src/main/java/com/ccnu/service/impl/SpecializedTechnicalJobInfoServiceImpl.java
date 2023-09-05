package com.ccnu.service.impl;

import com.ccnu.mapper.SpecializedTechnicalJobMapper;
import com.ccnu.pojo.SpecializedTechnicalJob;
import com.ccnu.pojo.SpecializedTechnicalJobExample;
import com.ccnu.pojo.dto.DictionaryDto;
import com.ccnu.service.SpecializedTechnicalJobInfoService;
import com.ccnu.utils.AppException;
import com.ccnu.utils.ErrorCode;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SpecializedTechnicalJobInfoServiceImpl implements SpecializedTechnicalJobInfoService {
    @Autowired
    SpecializedTechnicalJobMapper specializedTechnicalJobMapper;

    @Override
    public List<SpecializedTechnicalJob> getSpecializedTechnicalJobInfo(DictionaryDto dictionaryDto) {
        SpecializedTechnicalJobExample example=new SpecializedTechnicalJobExample();
        SpecializedTechnicalJobExample.Criteria criteria=example.createCriteria();
        if(StringUtils.isNotBlank(""+dictionaryDto.getId_type())){
            criteria.andIdTypeEqualTo(dictionaryDto.getId_type());
        }
        List<SpecializedTechnicalJob> specializedTechnicalJobs=specializedTechnicalJobMapper.selectByExample(example);
        if(specializedTechnicalJobs == null || specializedTechnicalJobs.size() < 1){
            return null;
        }
        return specializedTechnicalJobs;
    }
}
