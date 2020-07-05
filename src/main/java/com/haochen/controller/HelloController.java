package com.haochen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @autohor 刘美娟
 * @date 2020/7/5 -17:13
 */

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String Hello() {



    return "Hello,我来了！！！开发人员克隆下来，修改了代码！！！";
    }
}
