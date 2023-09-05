package com.ccnu.controller;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.ccnu.pojo.ConfirmInformation;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.dto.PersonalProgressDto;
import com.ccnu.pojo.dto.TutorIdentificationCodeDto;
import com.ccnu.pojo.vo.DoctorProgressVo;
import com.ccnu.service.PersonalProgressService;
import com.ccnu.utils.JWTUtils;
import com.ccnu.utils.PageQuery;
import com.ccnu.utils.PageUtils;
import com.ccnu.utils.ResultMessage;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author 王新强
 * @version 1.0
 * @date 2020/12/31 15:32
 */

@Controller
@Scope("prototype")
public class PersonalProgressController {


    String []confirm={".getTableConfirm111",".getTableConfirm111xu1"};
    String []timetest={};
    String []tablename={};


    //PersonalProgress

    @Autowired
    PersonalProgressService personalProgressService;
    @ResponseBody
    @RequestMapping(value = "/PersonalProgress",method = RequestMethod.POST)
    public ResultMessage<String> PersonalProgress(@RequestBody DoctorInfosQueryDto doctorInfosQueryDto){



        List<ConfirmInformation> confirmInformations=personalProgressService.PersonalProgress(doctorInfosQueryDto);
        int total= Integer.parseInt(confirmInformations.get(0).getTableConfirm111())+
                Integer.parseInt(confirmInformations.get(0).getTableConfirm111xu1())+
                Integer.parseInt(confirmInformations.get(0).getTableConfirm111xu2())+
                Integer.parseInt(confirmInformations.get(0).getTableConfirm112())+
                Integer.parseInt(confirmInformations.get(0).getTableConfirm121())+
                Integer.parseInt(confirmInformations.get(0).getTableConfirm211())+
                Integer.parseInt(confirmInformations.get(0).getTableConfirm212())+
                Integer.parseInt(confirmInformations.get(0).getTableConfirm213())+
                Integer.parseInt(confirmInformations.get(0).getTableConfirm214())+
                Integer.parseInt(confirmInformations.get(0).getTableConfirm215())+
                Integer.parseInt(confirmInformations.get(0).getTableConfirm221())+
                Integer.parseInt(confirmInformations.get(0).getTableConfirm222())+
                Integer.parseInt(confirmInformations.get(0).getTableConfirm223())+
                Integer.parseInt(confirmInformations.get(0).getTableConfirm224())+
                Integer.parseInt(confirmInformations.get(0).getTableConfirm225())+
                Integer.parseInt(confirmInformations.get(0).getTableConfirm226())+
                Integer.parseInt(confirmInformations.get(0).getTableConfirm227());

        NumberFormat numberFormat = NumberFormat.getInstance();
        // 设置精确到小数点后2位
        numberFormat.setMaximumFractionDigits(2);
        String result = numberFormat.format((float)total/(float)17*100);


        return ResultMessage.success(result);


    }

    @ResponseBody
    @RequestMapping(value = "/getAllDoctorsProgess",method = RequestMethod.POST)
    public ResultMessage<PageUtils<DoctorProgressVo>> getAllDoctorsProgess(@RequestBody DoctorInfosQueryDto dto,HttpServletRequest request) {

        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);

        return ResultMessage.success(personalProgressService.getAllDoctorsProgess(dto));
    }


    //personalSchedule

    @ResponseBody
    @RequestMapping(value = "/personalSchedule",method = RequestMethod.POST)
    public ResultMessage<List<PersonalProgressDto>> personalSchedule(@RequestBody DoctorInfosQueryDto doctorInfosQueryDto11) {
        List<ConfirmInformation> confirmInformations=personalProgressService.PersonalProgress(doctorInfosQueryDto11);


        List<PersonalProgressDto> personalProgressDtos = new ArrayList<PersonalProgressDto>();


        PersonalProgressDto personalProgressDto1 = new PersonalProgressDto();
        personalProgressDto1.setId(1);
        personalProgressDto1.setTable_confirm(confirmInformations.get(0).getTableConfirm111());
        personalProgressDto1.setTable_confirm_time(confirmInformations.get(0).getTableTime111());
        personalProgressDto1.setTable_name("表1-1-1 博士导师信息");
        personalProgressDtos.add(personalProgressDto1);


        PersonalProgressDto personalProgressDto2 = new PersonalProgressDto();
        personalProgressDto2.setId(2);
        personalProgressDto2.setTable_confirm(confirmInformations.get(0).getTableConfirm111xu1());
        personalProgressDto2.setTable_confirm_time(confirmInformations.get(0).getTableTime111xu1());
        personalProgressDto2.setTable_name("表1-1-1 博士导师信息（续1）");
        personalProgressDtos.add(personalProgressDto2);

        PersonalProgressDto personalProgressDto3 = new PersonalProgressDto();
        personalProgressDto3.setId(3);
        personalProgressDto3.setTable_confirm(confirmInformations.get(0).getTableConfirm111xu2());
        personalProgressDto3.setTable_confirm_time(confirmInformations.get(0).getTableTime111xu2());
        personalProgressDto3.setTable_name("表1-1-1 博士导师信息（续2）");
        personalProgressDtos.add(personalProgressDto3);

        PersonalProgressDto personalProgressDto4 = new PersonalProgressDto();
        personalProgressDto4.setId(4);
        personalProgressDto4.setTable_confirm(confirmInformations.get(0).getTableConfirm112());
        personalProgressDto4.setTable_confirm_time(confirmInformations.get(0).getTableTime112());
        personalProgressDto4.setTable_name("表1-1-2 博士生信息");
        personalProgressDtos.add(personalProgressDto4);

        PersonalProgressDto personalProgressDto5 = new PersonalProgressDto();
        personalProgressDto5.setId(5);
        personalProgressDto5.setTable_confirm(confirmInformations.get(0).getTableConfirm121());
        personalProgressDto5.setTable_confirm_time(confirmInformations.get(0).getTableTime121());
        personalProgressDto5.setTable_name("表1-2-1 科研项目情况");
        personalProgressDtos.add(personalProgressDto5);

        PersonalProgressDto personalProgressDto6 = new PersonalProgressDto();
        personalProgressDto6.setId(6);
        personalProgressDto6.setTable_confirm(confirmInformations.get(0).getTableConfirm211());
        personalProgressDto6.setTable_confirm_time(confirmInformations.get(0).getTableTime211());
        personalProgressDto6.setTable_name("表2-1-1 开课情况");
        personalProgressDtos.add(personalProgressDto6);

        PersonalProgressDto personalProgressDto7 = new PersonalProgressDto();
        personalProgressDto7.setId(7);
        personalProgressDto7.setTable_confirm(confirmInformations.get(0).getTableConfirm212());
        personalProgressDto7.setTable_confirm_time(confirmInformations.get(0).getTableTime212());
        personalProgressDto7.setTable_name("表2-1-2 研究生教育教学改革研究项目情况");
        personalProgressDtos.add(personalProgressDto7);

        PersonalProgressDto personalProgressDto8 = new PersonalProgressDto();
        personalProgressDto8.setId(8);
        personalProgressDto8.setTable_confirm(confirmInformations.get(0).getTableConfirm213());
        personalProgressDto8.setTable_confirm_time(confirmInformations.get(0).getTableTime213());
        personalProgressDto8.setTable_name("表2-1-3 出版教材情况");
        personalProgressDtos.add(personalProgressDto8);

        PersonalProgressDto personalProgressDto9 = new PersonalProgressDto();
        personalProgressDto9.setId(9);
        personalProgressDto9.setTable_confirm(confirmInformations.get(0).getTableConfirm214());
        personalProgressDto9.setTable_confirm_time(confirmInformations.get(0).getTableTime214());
        personalProgressDto9.setTable_name("表2-1-4 研究生教学成果获奖情况");
        personalProgressDtos.add(personalProgressDto9);

        PersonalProgressDto personalProgressDto10 = new PersonalProgressDto();
        personalProgressDto10.setId(10);
        personalProgressDto10.setTable_confirm(confirmInformations.get(0).getTableConfirm215());
        personalProgressDto10.setTable_confirm_time(confirmInformations.get(0).getTableTime215());
        personalProgressDto10.setTable_name("表2-1-5 指导博士生获奖情况");
        personalProgressDtos.add(personalProgressDto10);

        PersonalProgressDto personalProgressDto11 = new PersonalProgressDto();
        personalProgressDto11.setId(11);
        personalProgressDto11.setTable_confirm(confirmInformations.get(0).getTableConfirm221());
        personalProgressDto11.setTable_confirm_time(confirmInformations.get(0).getTableTime221());
        personalProgressDto11.setTable_name("表2-2-1 科研论文情况");
        personalProgressDtos.add(personalProgressDto11);

        PersonalProgressDto personalProgressDto12 = new PersonalProgressDto();
        personalProgressDto12.setId(12);
        personalProgressDto12.setTable_confirm(confirmInformations.get(0).getTableConfirm222());
        personalProgressDto12.setTable_confirm_time(confirmInformations.get(0).getTableTime222());
        personalProgressDto12.setTable_name("表2-2-2 科研获奖情况");
        personalProgressDtos.add(personalProgressDto12);

        PersonalProgressDto personalProgressDto13= new PersonalProgressDto();
        personalProgressDto13.setId(13);
        personalProgressDto13.setTable_confirm(confirmInformations.get(0).getTableConfirm223());
        personalProgressDto13.setTable_confirm_time(confirmInformations.get(0).getTableTime223());
        personalProgressDto13.setTable_name("表2-2-3 出版著作情况");
        personalProgressDtos.add(personalProgressDto13);

        PersonalProgressDto personalProgressDto14 = new PersonalProgressDto();
        personalProgressDto14.setId(14);
        personalProgressDto14.setTable_confirm(confirmInformations.get(0).getTableConfirm224());
        personalProgressDto14.setTable_confirm_time(confirmInformations.get(0).getTableTime224());
        personalProgressDto14.setTable_name("表2-2-4 专利（著作权）授权情况");
        personalProgressDtos.add(personalProgressDto14);

        PersonalProgressDto personalProgressDto15 = new PersonalProgressDto();
        personalProgressDto15.setId(15);
        personalProgressDto15.setTable_confirm(confirmInformations.get(0).getTableConfirm225());
        personalProgressDto15.setTable_confirm_time(confirmInformations.get(0).getTableTime225());
        personalProgressDto15.setTable_name("表2-2-5 参加国际学术会议情况");
        personalProgressDtos.add(personalProgressDto15);

        PersonalProgressDto personalProgressDto16 = new PersonalProgressDto();
        personalProgressDto16.setId(16);
        personalProgressDto16.setTable_confirm(confirmInformations.get(0).getTableConfirm226());
        personalProgressDto16.setTable_confirm_time(confirmInformations.get(0).getTableTime226());
        personalProgressDto16.setTable_name("表2-2-6 学术任职情况");
        personalProgressDtos.add(personalProgressDto16);

        PersonalProgressDto personalProgressDto17 = new PersonalProgressDto();
        personalProgressDto17.setId(17);
        personalProgressDto17.setTable_confirm(confirmInformations.get(0).getTableConfirm227());
        personalProgressDto17.setTable_confirm_time(confirmInformations.get(0).getTableTime227());
        personalProgressDto17.setTable_name("表2-2-7 依托科研平台情况");
        personalProgressDtos.add(personalProgressDto17);



        return ResultMessage.success(personalProgressDtos);
    }




}
