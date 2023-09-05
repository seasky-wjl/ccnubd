package com.ccnu.service;

import com.ccnu.pojo.TalentSelectionProject;
import com.ccnu.pojo.dto.DictionaryDto;

import java.util.List;

public interface TalentSelectionProjectService {
    public List<TalentSelectionProject> getTalentSelectionProject(DictionaryDto dictionaryDto);
}
