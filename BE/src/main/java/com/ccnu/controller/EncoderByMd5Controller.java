package com.ccnu.controller;

import com.ccnu.pojo.UserAccount;
import com.ccnu.service.UserAccountService;
import com.ccnu.utils.ResultMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;

/**
 * @author 王新强
 * @version 1.0
 * @date 2021/1/4 15:00
 */

@Controller
@Scope("prototype")
public class EncoderByMd5Controller {

    @Autowired
    UserAccountService userAccountService;

    @ResponseBody
    @RequestMapping(value = "/EncoderByMd5",method = RequestMethod.POST)
    public ResultMessage<Integer> EncoderByMd5() throws NoSuchAlgorithmException, UnsupportedEncodingException {

        List<UserAccount> userAccounts=userAccountService.getAlluser();

        //确定计算方法
        MessageDigest md5= MessageDigest.getInstance("MD5");
        BASE64Encoder base64en = new BASE64Encoder();
        //加密后的字符串
        Iterator<UserAccount> iterator =userAccounts.iterator();
        for (UserAccount userAccount:userAccounts){
           // userAccount.getId()
            if (userAccount.getUsername()==null||userAccount.getUsername()=="adminyjsy")
            {continue;}

                String newstr=base64en.encode(md5.digest(userAccount.getPasswd().getBytes()));
                userAccount.setPasswd(newstr);
                userAccountService.userUpdata(userAccount);
        }
        return ResultMessage.success(1);
    }

}
