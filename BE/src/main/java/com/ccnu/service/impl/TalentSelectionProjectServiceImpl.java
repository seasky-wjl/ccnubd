package com.ccnu.service.impl;

import com.ccnu.mapper.TalentSelectionProjectMapper;
import com.ccnu.pojo.TalentSelectionProject;
import com.ccnu.pojo.TalentSelectionProjectExample;
import com.ccnu.pojo.dto.DictionaryDto;
import com.ccnu.service.TalentSelectionProjectService;
import com.ccnu.utils.AppException;
import com.ccnu.utils.ErrorCode;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TalentSelectionProjectServiceImpl implements TalentSelectionProjectService {
    @Autowired
    TalentSelectionProjectMapper talentSelectionProjectMapper;

    @Override
    public List<TalentSelectionProject> getTalentSelectionProject(DictionaryDto dictionaryDto) {
        TalentSelectionProjectExample example=new TalentSelectionProjectExample();
        TalentSelectionProjectExample.Criteria criteria=example.createCriteria();
        if(StringUtils.isNotBlank(""+dictionaryDto.getId_type())){
            criteria.andIdTypeEqualTo(dictionaryDto.getId_type());

        }
        List<TalentSelectionProject> talentSelectionProjects=talentSelectionProjectMapper.selectByExample(example);
        if(talentSelectionProjects == null || talentSelectionProjects.size() < 1){
            return null;
        }

        return talentSelectionProjects;
    }
}
