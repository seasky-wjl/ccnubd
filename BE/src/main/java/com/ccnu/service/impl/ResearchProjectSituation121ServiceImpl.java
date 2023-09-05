package com.ccnu.service.impl;

import com.ccnu.mapper.ResearchProjectSituation121Mapper;
import com.ccnu.mapper.UserAccountMapper;
import com.ccnu.pojo.ResearchProjectSituation121;
import com.ccnu.pojo.ResearchProjectSituation121Example;
import com.ccnu.pojo.UserAccount;
import com.ccnu.pojo.UserAccountExample;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.dto.IdDto;
import com.ccnu.pojo.vo.ResearchProjectSituation121Vo;
import com.ccnu.service.ResearchProjectSituation121Service;
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

/**
 * @author 王新强
 * @version 1.0
 * @date 2020/12/23 20:23
 */
@Service
public class ResearchProjectSituation121ServiceImpl implements ResearchProjectSituation121Service {

    @Autowired
    ResearchProjectSituation121Mapper researchProjectSituation121Mapper;
    @Autowired
    UserAccountMapper userAccountMapper;

    @Override
    public PageUtils<ResearchProjectSituation121Vo> getAllResearchProjectInfoBy121(DoctorInfosQueryDto doctorInfosQueryDto) {
        Page<ResearchProjectSituation121Vo> page = PageHelper.startPage(doctorInfosQueryDto.getPageNo(),doctorInfosQueryDto.getPageSize());
        List<ResearchProjectSituation121Vo> doctorsInfo = researchProjectSituation121Mapper.getAllResearchProjectInfoBy121(doctorInfosQueryDto);
        if(doctorsInfo == null || doctorsInfo.size() < 1){
            return null;
        }
        PageUtils<ResearchProjectSituation121Vo> pageUtils = new PageUtils<>(page.getPageNum(), page.getPageSize(),
                page.getTotal(), doctorsInfo);
        return pageUtils;
    }

    @Override
    public Boolean addResearchProjectInfoBy121(ResearchProjectSituation121 researchProjectSituation121) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if(researchProjectSituation121.getId() == null){
            //新增
            ResearchProjectSituation121Example example = new ResearchProjectSituation121Example();
            example.createCriteria().andTutorIdentificationCodeEqualTo(researchProjectSituation121.getTutorIdentificationCode());

            List<ResearchProjectSituation121> doctorTutorInfos = researchProjectSituation121Mapper.selectByExample(example);
//            if(doctorTutorInfos != null && doctorTutorInfos.size() > 0){
//                throw new AppException(ErrorCode.ERR_EXISTED,"当前信息已存在,请勿重复添加");
//            }
            researchProjectSituation121.setLastTime(sdf.format(new Date()));

            //默认未删除
            researchProjectSituation121.setIsdelete("0");
            researchProjectSituation121Mapper.insert(researchProjectSituation121);
        }
        return true;
    }

    @Override
    public ResearchProjectSituation121 updateResearchProjectInfoBy121(ResearchProjectSituation121 researchProjectSituation121) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        researchProjectSituation121.setLastTime(sdf.format(new Date()));
        //默认未删除
        if(StringUtils.isBlank(researchProjectSituation121.getIsdelete())){
            researchProjectSituation121.setIsdelete("0");
        }
        //前端选择传数据id或导师唯一识别码
        if(researchProjectSituation121.getId() == null || researchProjectSituation121.getId() < 1){
            if(StringUtils.isBlank(researchProjectSituation121.getTutorIdentificationCode())){
                throw new AppException(ErrorCode.ERR_PARAM);
            }else {

                ResearchProjectSituation121Example example = new ResearchProjectSituation121Example();
                example.createCriteria().andTutorIdentificationCodeEqualTo(researchProjectSituation121.getTutorIdentificationCode());
                List<ResearchProjectSituation121> doctorTutorInfos = researchProjectSituation121Mapper.selectByExample(example);
                if(doctorTutorInfos == null || doctorTutorInfos.size() < 1){
                    throw new AppException(ErrorCode.NOT_EXIST);
                }
                researchProjectSituation121.setId(doctorTutorInfos.get(0).getId());
            }
        }
        researchProjectSituation121Mapper.updateByPrimaryKey(researchProjectSituation121);
        return researchProjectSituation121;

    }

    @Override
    public Boolean deleteResearchProjectInfoBy121(Integer id) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        ResearchProjectSituation121 ResearchProjectSituation121 = researchProjectSituation121Mapper.selectByPrimaryKey(id);
        if(ResearchProjectSituation121 == null){
            throw new AppException(ErrorCode.NOT_EXIST);
        }
        ResearchProjectSituation121.setLastTime(sdf.format(new Date()));
        //1代表删除
        ResearchProjectSituation121.setIsdelete("1");
        researchProjectSituation121Mapper.updateByPrimaryKey(ResearchProjectSituation121);
        return true;

    }

    @Override
    public ResearchProjectSituation121 getResearchProjectInfoBy121(IdDto idDto) {
        ResearchProjectSituation121Example example = new ResearchProjectSituation121Example();
        ResearchProjectSituation121Example.Criteria criteria = example.createCriteria();
        if(idDto.getId() != null && idDto.getId() > 0){
            criteria.andIdEqualTo(idDto.getId());
        }
        criteria.andIsdeleteEqualTo("0");
        List<ResearchProjectSituation121> researchProjectSituation121s = researchProjectSituation121Mapper.selectByExample(example);
        if(researchProjectSituation121s == null || researchProjectSituation121s.size() < 1){
            return null;
        }else {
            return researchProjectSituation121s.get(0);
        }
    }
}
