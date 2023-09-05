package com.ccnu.utils;


import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import sun.misc.BASE64Encoder;


/**
 * @author 王新强
 * @version 1.0
 * @date 2021/1/12 17:02
 */
public class Md5passWd {

    public String passWdMd5(String str)throws NoSuchAlgorithmException, UnsupportedEncodingException {

        //确定计算方法
        MessageDigest md5= MessageDigest.getInstance("MD5");
        BASE64Encoder base64en = new BASE64Encoder();

        String newstr=base64en.encode(md5.digest(str.getBytes()));

        return newstr;
    }
}
