package com.ccnu.controller;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.ccnu.pojo.UserAccount;
import com.ccnu.pojo.dto.DoctorInfosQueryDto;
import com.ccnu.pojo.dto.UserInfosDto;
import com.ccnu.pojo.dto.UserPwUpData;
import com.ccnu.pojo.dto.UserTypeDto;
import com.ccnu.pojo.vo.UserAccountVo;
import com.ccnu.service.UserAccountService;
import com.ccnu.service.UserStatusService;
import com.ccnu.utils.AppException;
import com.ccnu.utils.ErrorCode;
import com.ccnu.utils.JWTUtils;
import com.ccnu.utils.Md5passWd;
import com.ccnu.utils.ResultMessage;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 王新强
 * @version 1.0
 * @date 2020/12/22 23:06
 */

@Controller
@Scope("prototype")
public class UserAccountController {


    @Autowired
    UserAccountService userAccountService;
    @Autowired
    private UserStatusService userStatusService;

    @ResponseBody
    @RequestMapping(value = "/userLogin", method = RequestMethod.POST)
    public ResultMessage<Map<String, Object>> userLogin(@RequestBody UserInfosDto userInfosDto)
            throws UnsupportedEncodingException, NoSuchAlgorithmException {
        if(StringUtils.isBlank(userInfosDto.getUsername()) || StringUtils.isBlank(userInfosDto.getPasswd())){
            throw new AppException(ErrorCode.ERR_PARAM);
        }
        Map<String, Object> map = userAccountService.login(userInfosDto);
        return ResultMessage.success(map);
    }


    @ResponseBody
    @RequestMapping(value = "/user/test", method = RequestMethod.POST)
    public Map<String, Object> test(HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        //处理自己业务逻辑
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        map.put("state", true);
        map.put("msg", "请求成功!");
        String role = JWTUtils.getRoleFromToken(token);
        return map;
    }


    @ResponseBody
    @RequestMapping(value = "/userUpdata", method = RequestMethod.PUT)
    public ResultMessage<UserAccount> userUpdata(@RequestBody UserAccount userAccount, HttpServletRequest request) {
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        String role = JWTUtils.getRoleFromToken(token);
        //当前登录用户为博导，用户管理页面该接口则不允许编辑
        if(role.equals("4")){
            return ResultMessage.fail(ErrorCode.NO_RIGHTS,"当前用户没有访问权限!");
        }
        UserAccount userAccount1 = userAccountService.userUpdata(userAccount);
        return ResultMessage.success(userAccount1);
    }


    @ResponseBody
    @RequestMapping(value = "/getUser", method = RequestMethod.POST)
    public ResultMessage<UserAccount> getUser(@RequestBody UserInfosDto userInfosDto, HttpServletRequest request) {
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        String role = JWTUtils.getRoleFromToken(token);
        //当前登录用户为博导，用户管理页面该接口则不允许查看
        if(role.equals("4")){
            return ResultMessage.fail(ErrorCode.NO_RIGHTS,"当前用户没有访问权限!");
        }
        UserAccount user = userAccountService.getUserAccount(userInfosDto);
        return ResultMessage.success(user);
    }


    /**
     * 用户管理模块：用户展示
     * @param userTypeDto
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/selectCollegeUser", method = RequestMethod.POST)
    public ResultMessage<List<UserAccountVo>> selectCollegeUser(@RequestBody UserTypeDto userTypeDto,
            HttpServletRequest request) {
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        String role = JWTUtils.getRoleFromToken(token);
        //当前登录用户为博导，则不展示数据
        if(role.equals("4")){
            return ResultMessage.fail(ErrorCode.NO_RIGHTS,"当前用户没有访问权限!");
        }
        //传学院编码
        return ResultMessage.success(userAccountService.selectCollegeUser(userTypeDto));
    }


    @ResponseBody
    @RequestMapping(value = "/adduserAccount", method = RequestMethod.POST)
    public ResultMessage<Boolean> adduserAccount(@RequestBody UserAccount userAccount, HttpServletRequest request) {
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        String role = JWTUtils.getRoleFromToken(token);
        //当前登录用户为博导，用户管理页面该接口则不允许添加
        if(role.equals("4")){
            return ResultMessage.fail(ErrorCode.NO_RIGHTS,"当前用户没有访问权限!");
        }
        return ResultMessage.success(userAccountService.adduserAccount(userAccount));
    }

    @ResponseBody
    @RequestMapping(value = "/userUpdataPasswd", method = RequestMethod.PUT)
    public ResultMessage<Integer> userUpdataPasswd(@RequestBody UserPwUpData userPwUpData, HttpServletRequest request)
            throws UnsupportedEncodingException, NoSuchAlgorithmException {
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);

        UserInfosDto userInfosDto = new UserInfosDto();
        userInfosDto.setUsername(userPwUpData.getUsername());

        UserAccount userAccount1 = userAccountService.getUserAccount(userInfosDto);
        String pswdStr = userAccount1.getPasswd();

        Md5passWd md5passWd = new Md5passWd();
        String str = md5passWd.passWdMd5(userPwUpData.getOlderPw());//传进来加密密码
        if (pswdStr.equals(str)) {
            UserAccount userAccount = new UserAccount();
            userAccount.setId(userPwUpData.getId());
            userAccount.setPasswd(md5passWd.passWdMd5(userPwUpData.getNewPw()));
            userAccountService.userUpdatapw(userAccount);
        } else {
            throw new AppException(ErrorCode.NOT_EXIST, "初始密码输入错误");
        }

        return ResultMessage.success(1);
    }


    //重置用户密码
    @ResponseBody
    @RequestMapping(value = "/userResetPasswd", method = RequestMethod.PUT)
    public ResultMessage<Integer> userResetPasswd(@RequestBody UserAccount userAccount1, HttpServletRequest request)
            throws UnsupportedEncodingException, NoSuchAlgorithmException {
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        String role = JWTUtils.getRoleFromToken(token);
        //当前登录用户为博导，则不允许修改
        if(role.equals("4")){
            return ResultMessage.fail(ErrorCode.NO_RIGHTS,"当前用户没有访问权限!");
        }
        Md5passWd md5passWd = new Md5passWd();
        if (userAccount1.getId() > 0) {

            UserAccount userAccount = new UserAccount();
            userAccount.setId(userAccount1.getId());
            userAccount.setPasswd(md5passWd.passWdMd5("bd@ccnu10511"));
            userAccountService.userUpdatapw(userAccount);
        }

        return ResultMessage.success(1);
    }

    /**
     * 更新用户为下岗状态
     * @param userAccount1
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/updateUserWorkStatus", method = RequestMethod.PUT)
    public ResultMessage updateUserWorkStatus(@RequestBody UserAccount userAccount1, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        String role = JWTUtils.getRoleFromToken(token);
        //当前登录用户为博导，则不允许修改
        if(role.equals("4")){
            return ResultMessage.fail(ErrorCode.NO_RIGHTS,"当前用户没有访问权限!");
        }
        Md5passWd md5passWd = new Md5passWd();
        if(userAccount1.getId() == null || userAccount1.getId() < 1){
            throw new AppException(ErrorCode.ERR_PARAM);
        }
        userStatusService.updateUserWorkStatus(userAccount1.getId());
        return ResultMessage.success(true);
    }

    /**
     * 更新用户为在岗状态
     * @param userAccount1
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/updateUserOnWorkStatus", method = RequestMethod.PUT)
    public ResultMessage updateUserOnWorkStatus(@RequestBody UserAccount userAccount1, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        String role = JWTUtils.getRoleFromToken(token);
        //当前登录用户为博导，则不允许修改
        if(role.equals("4")){
            return ResultMessage.fail(ErrorCode.NO_RIGHTS,"当前用户没有访问权限!");
        }
        Md5passWd md5passWd = new Md5passWd();
        if(userAccount1.getId() == null || userAccount1.getId() < 1){
            throw new AppException(ErrorCode.ERR_PARAM);
        }
        userStatusService.updateUserOnWorkStatus(userAccount1.getId());
        return ResultMessage.success(true);
    }

    /**
     * 删除用户
     * @param userAccount1
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/deleteUser", method = RequestMethod.PUT)
    public ResultMessage deleteUser(@RequestBody UserAccount userAccount1, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        String role = JWTUtils.getRoleFromToken(token);
        //当前登录用户为博导，则不允许修改
        if(role.equals("4")){
            return ResultMessage.fail(ErrorCode.NO_RIGHTS,"当前用户没有访问权限!");
        }
        Md5passWd md5passWd = new Md5passWd();
        if(StringUtils.isBlank(userAccount1.getUsername())){
            throw new AppException(ErrorCode.ERR_PARAM);
        }
        userAccountService.deleteUser(userAccount1.getUsername());
        return ResultMessage.success(true);
    }

    @ResponseBody
    @RequestMapping(value = "/unlockAccount", method = RequestMethod.PUT)
    public ResultMessage unlockAccount(@RequestBody UserAccount userAccount1, HttpServletRequest request){
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        String role = JWTUtils.getRoleFromToken(token);
        //当前登录用户为博导，则不允许修改
        if(role.equals("4")){
            return ResultMessage.fail(ErrorCode.NO_RIGHTS,"当前用户没有访问权限!");
        }
        Md5passWd md5passWd = new Md5passWd();
        if(userAccount1.getId() == null || userAccount1.getId() < 1){
            throw new AppException(ErrorCode.ERR_PARAM);
        }
        userAccountService.unlockAccount(userAccount1.getId());
        return ResultMessage.success(true);
    }


}
