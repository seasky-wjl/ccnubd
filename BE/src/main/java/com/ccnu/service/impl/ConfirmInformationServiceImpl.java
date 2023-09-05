package com.ccnu.service.impl;

import com.ccnu.mapper.ConfirmInformationMapper;
import com.ccnu.pojo.ConfirmInformation;
import com.ccnu.pojo.ConfirmInformationExample;
import com.ccnu.pojo.dto.ConfirmInfosDto;
import com.ccnu.service.ConfirmInformationService;
import com.ccnu.utils.AppException;
import com.ccnu.utils.ErrorCode;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class ConfirmInformationServiceImpl implements ConfirmInformationService {
    @Autowired
    ConfirmInformationMapper confirmInformationMapper;
    @Override
    public ConfirmInformation updateConfirmInformation(ConfirmInfosDto confirmInfosDto) {

        ConfirmInformation confirmInformation;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //前端选择传数据id或导师唯一识别码
        if(confirmInfosDto.getTutorIdentificationCode() == null || StringUtils.isBlank(confirmInfosDto.getTableName())){
                throw new AppException(ErrorCode.ERR_PARAM);
        }else {
            ConfirmInformationExample example = new ConfirmInformationExample();
            example.createCriteria().andTutorIdentificationCodeEqualTo(confirmInfosDto.getTutorIdentificationCode());
            List<ConfirmInformation> confirmInformations = confirmInformationMapper.selectByExample(example);
            confirmInformation = confirmInformations.get(0);
            if(confirmInformations.isEmpty()){
                throw new AppException(ErrorCode.NOT_EXIST);
            }else{
                //confirmInformation.setId(confirmInformations.get(0).getId());
                if(confirmInfosDto.getTableName().equals("table_confirm111")){
                    confirmInformation.setTableConfirm111("1");
                    confirmInformation.setTableTime111(sdf.format(new Date()));
                }
                if(confirmInfosDto.getTableName().equals("table_confirm111xu")){
                    confirmInformation.setTableConfirm111xu1("1");
                    confirmInformation.setTableTime111xu1(sdf.format(new Date()));
                }
                if(confirmInfosDto.getTableName().equals("table_confirm111xu2")){
                    confirmInformation.setTableConfirm111xu2("1");
                    confirmInformation.setTableTime111xu2(sdf.format(new Date()));
                }
                if(confirmInfosDto.getTableName().equals("table_confirm112")){
                    confirmInformation.setTableConfirm112("1");
                    confirmInformation.setTableTime112(sdf.format(new Date()));
                }
                if(confirmInfosDto.getTableName().equals("table_confirm121")){
                    confirmInformation.setTableConfirm121("1");
                    confirmInformation.setTableTime121(sdf.format(new Date()));
                }
                if(confirmInfosDto.getTableName().equals("table_confirm211")){
                    confirmInformation.setTableConfirm211("1");
                    confirmInformation.setTableTime211(sdf.format(new Date()));
                }
                if(confirmInfosDto.getTableName().equals("table_confirm212")){
                    confirmInformation.setTableConfirm212("1");
                    confirmInformation.setTableTime212(sdf.format(new Date()));
                }
                if(confirmInfosDto.getTableName().equals("table_confirm213")){
                    confirmInformation.setTableConfirm213("1");
                    confirmInformation.setTableTime213(sdf.format(new Date()));
                }
                if(confirmInfosDto.getTableName().equals("table_confirm214")){
                    confirmInformation.setTableConfirm214("1");
                    confirmInformation.setTableTime214(sdf.format(new Date()));
                }
                if(confirmInfosDto.getTableName().equals("table_confirm215")){
                    confirmInformation.setTableConfirm215("1");
                    confirmInformation.setTableTime215(sdf.format(new Date()));
                }
                if(confirmInfosDto.getTableName().equals("table_confirm221")){
                    confirmInformation.setTableConfirm221("1");
                    confirmInformation.setTableTime221(sdf.format(new Date()));
                }
                if(confirmInfosDto.getTableName().equals("table_confirm222")){
                    confirmInformation.setTableConfirm222("1");
                    confirmInformation.setTableTime222(sdf.format(new Date()));
                }
                if(confirmInfosDto.getTableName().equals("table_confirm223")){
                    confirmInformation.setTableConfirm223("1");
                    confirmInformation.setTableTime223(sdf.format(new Date()));
                }
                if(confirmInfosDto.getTableName().equals("table_confirm224")){
                    confirmInformation.setTableConfirm224("1");
                    confirmInformation.setTableTime224(sdf.format(new Date()));
                }
                if(confirmInfosDto.getTableName().equals("table_confirm225")){
                    confirmInformation.setTableConfirm225("1");
                    confirmInformation.setTableTime225(sdf.format(new Date()));
                }
                if(confirmInfosDto.getTableName().equals("table_confirm226")){
                    confirmInformation.setTableConfirm226("1");
                    confirmInformation.setTableTime226(sdf.format(new Date()));
                }
                if(confirmInfosDto.getTableName().equals("table_confirm227")){
                    confirmInformation.setTableConfirm227("1");
                    confirmInformation.setTableTime227(sdf.format(new Date()));
                }
                //设置总提交状态
                if(confirmInformation.getTableConfirm111().equals("1") && confirmInformation.getTableConfirm111xu1().equals("1") && confirmInformation.getTableConfirm111xu2().equals("1")
                    && confirmInformation.getTableConfirm112().equals("1") && confirmInformation.getTableConfirm121().equals("1") && confirmInformation.getTableConfirm211().equals("1")
                    && confirmInformation.getTableConfirm212().equals("1") && confirmInformation.getTableConfirm213().equals("1") && confirmInformation.getTableConfirm214().equals("1")
                    && confirmInformation.getTableConfirm215().equals("1") && confirmInformation.getTableConfirm221().equals("1") && confirmInformation.getTableConfirm222().equals("1")
                    && confirmInformation.getTableConfirm223().equals("1") && confirmInformation.getTableConfirm224().equals("1") && confirmInformation.getTableConfirm225().equals("1")
                    && confirmInformation.getTableConfirm226().equals("1") && confirmInformation.getTableConfirm227().equals("1")){
                    confirmInformation.setTotalConfirm("1");
                    confirmInformation.setTotalTime(sdf.format(new Date()));
                }
            }
        }
        confirmInformationMapper.updateByPrimaryKey(confirmInformation);
        return confirmInformation;
    }
}
