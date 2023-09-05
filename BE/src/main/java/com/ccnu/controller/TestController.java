package com.ccnu.controller;

import com.ccnu.utils.ResultMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author 王新强
 * @version 1.0
 * @date 2020/12/23 22:55
 */

@Controller
public class TestController {

    @GetMapping("/test")
    @ResponseBody
    public ResultMessage hello(){
        return ResultMessage.success(null);
    }
}
