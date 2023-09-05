package com.ccnu.service;

import com.ccnu.pojo.SubjectDirectory;
import com.ccnu.pojo.dto.DictionaryDto;

import java.util.List;

public interface SubjectDirectoryService {
    public List<SubjectDirectory> getSubjectDirectory(DictionaryDto dictionaryDto);
}
