package com.ccnu.service.impl;

import com.ccnu.mapper.SubjectDirectoryMapper;
import com.ccnu.pojo.SubjectDirectory;
import com.ccnu.pojo.SubjectDirectoryExample;
import com.ccnu.pojo.dto.DictionaryDto;
import com.ccnu.service.SubjectDirectoryService;
import com.ccnu.utils.AppException;
import com.ccnu.utils.ErrorCode;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SubjectDirectoryServiceImpl implements SubjectDirectoryService {
    @Autowired
    SubjectDirectoryMapper subjectDirectoryMapper;

    @Override
    public List<SubjectDirectory> getSubjectDirectory(DictionaryDto dictionaryDto) {
        SubjectDirectoryExample example=new SubjectDirectoryExample();
        SubjectDirectoryExample.Criteria criteria=example.createCriteria();
        if(StringUtils.isNotBlank(""+dictionaryDto.getId_type())){
            criteria.andIdTypeEqualTo(dictionaryDto.getId_type());
        }
        example.setOrderByClause("data_code ASC");
        List<SubjectDirectory> dataDictionaryTypes=subjectDirectoryMapper.selectByExample(example);
        if(dataDictionaryTypes == null || dataDictionaryTypes.size() < 1){
            return null;
        }

        return dataDictionaryTypes;
    }
}
