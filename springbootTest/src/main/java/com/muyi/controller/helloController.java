package com.muyi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2020/6/20 0020.
 */
@RestController
public class helloController {

    @RequestMapping("/hello")
    public String test(){
        return "hello,springboo1";
    }
    @RequestMapping("/he")
    public String tt(){
        return "hello,sp那份大部分";
    }


}
