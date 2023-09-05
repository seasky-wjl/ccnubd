package com.ccnu.service;

import com.ccnu.pojo.ConfirmInformation;
import com.ccnu.pojo.dto.ConfirmInfosDto;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.utils.PageUtils;
import com.ccnu.utils.ResultMessage;

public interface ConfirmInformationService {

    ConfirmInformation updateConfirmInformation(ConfirmInfosDto confirmInfosDto);
}
