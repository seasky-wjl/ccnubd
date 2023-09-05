package com.ccnu.service.impl;

import com.ccnu.mapper.ResearchPapers221Mapper;
import com.ccnu.mapper.UserAccountMapper;
import com.ccnu.pojo.ResearchPapers221;
import com.ccnu.pojo.ResearchPapers221Example;
import com.ccnu.pojo.UserAccount;
import com.ccnu.pojo.UserAccountExample;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.dto.IdDto;
import com.ccnu.pojo.vo.ResearchPapers221Vo;
import com.ccnu.service.ResearchPapers221Service;
import com.ccnu.utils.AppException;
import com.ccnu.utils.ErrorCode;
import com.ccnu.utils.PageUtils;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResearchPapers221ServiceImpl implements ResearchPapers221Service {

    @Autowired
    ResearchPapers221Mapper researchPapers221Mapper;
    @Autowired
    UserAccountMapper userAccountMapper;

    @Override
    public PageUtils<ResearchPapers221Vo> getAllDoctorPapersInfoBy221(DoctorInfosQueryDto doctorInfosQueryDto) {
        Page<ResearchPapers221Vo> page = PageHelper.startPage(doctorInfosQueryDto.getPageNo(),doctorInfosQueryDto.getPageSize());
        List<ResearchPapers221Vo> doctorsInfo = researchPapers221Mapper.getAllDoctorPapersInfoBy221(doctorInfosQueryDto);
        if(doctorsInfo == null || doctorsInfo.size() < 1){
            return null;
        }
        PageUtils<ResearchPapers221Vo> pageUtils = new PageUtils<>(page.getPageNum(), page.getPageSize(),
                page.getTotal(), doctorsInfo);
        return pageUtils;
    }

    @Override
    public Boolean addPapersInfoBy221(ResearchPapers221 researchPapers221) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if(researchPapers221.getId() == null){
            //新增
            ResearchPapers221Example example = new ResearchPapers221Example();
            example.createCriteria().andTutorIdentificationCodeEqualTo(researchPapers221.getTutorIdentificationCode());
            List<ResearchPapers221> doctorTutorInfos = researchPapers221Mapper.selectByExample(example);
//            if(doctorTutorInfos != null && doctorTutorInfos.size() > 0){
//                throw new AppException(ErrorCode.ERR_EXISTED,"当前博导信息已存在,请勿重复添加");
//            }
            researchPapers221.setLastTime(sdf.format(new Date()));
            //默认未删除
            researchPapers221.setIsdelete("0");
            researchPapers221Mapper.insert(researchPapers221);
        }
        return true;
    }

    @Override
    public ResearchPapers221 updatePapersInfoBy221(ResearchPapers221 researchPapers221) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        researchPapers221.setLastTime(sdf.format(new Date()));
        //默认未删除
        if(StringUtils.isBlank(researchPapers221.getIsdelete())){
            researchPapers221.setIsdelete("0");
        }
        //前端选择传数据id或导师唯一识别码
        if(researchPapers221.getId() == null || researchPapers221.getId() < 1){
            if(StringUtils.isBlank(researchPapers221.getTutorIdentificationCode())){
                throw new AppException(ErrorCode.ERR_PARAM);
            }else {
                ResearchPapers221Example example = new ResearchPapers221Example();
                example.createCriteria().andTutorIdentificationCodeEqualTo(researchPapers221.getTutorIdentificationCode());
                List<ResearchPapers221> doctorTutorInfos = researchPapers221Mapper.selectByExample(example);
                if(doctorTutorInfos == null || doctorTutorInfos.size() < 1){
                    throw new AppException(ErrorCode.NOT_EXIST);
                }
                researchPapers221.setId(doctorTutorInfos.get(0).getId());
            }
        }
        researchPapers221Mapper.updateByPrimaryKey(researchPapers221);
        return researchPapers221;
    }

    @Override
    public Boolean deletePapersInfoBy221(Integer id) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        ResearchPapers221 researchPapers221 = researchPapers221Mapper.selectByPrimaryKey(id);
        if(researchPapers221 == null){
            throw new AppException(ErrorCode.NOT_EXIST);
        }
        researchPapers221.setLastTime(sdf.format(new Date()));
        //1代表删除
        researchPapers221.setIsdelete("1");
        researchPapers221Mapper.updateByPrimaryKey(researchPapers221);
        return true;
    }

    @Override
    public ResearchPapers221 getDoctorPapersInfoBy221(IdDto idDto) {
        ResearchPapers221Example example = new ResearchPapers221Example();
        ResearchPapers221Example.Criteria criteria = example.createCriteria();
        if(idDto.getId() != null && idDto.getId() > 0){
            criteria.andIdEqualTo(idDto.getId());
        }
        criteria.andIsdeleteEqualTo("0");
        List<ResearchPapers221> researchPapers221s = researchPapers221Mapper.selectByExample(example);
        if(researchPapers221s == null || researchPapers221s.size() < 1){
            return null;
        }else {
            return researchPapers221s.get(0);
        }
    }
}
