package com.ccnu.service;

import com.ccnu.pojo.CourseStatus211;
import com.ccnu.pojo.DataDictionaryType;
import com.ccnu.pojo.dto.DictionaryDto;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.utils.PageUtils;

import java.util.List;

/**
 * @author 王新强
 * @version 1.0
 * @date 2020/12/29 12:49
 */
public interface DataDictionaryTypeInfoService {



    public List<DataDictionaryType> getDataDictionaryTypeInfo(DictionaryDto dictionaryDto);


}
