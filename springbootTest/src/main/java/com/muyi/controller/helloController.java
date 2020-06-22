package com.muyi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2020/6/20 0020.
 */

/*测试git修改提交*/
@RestController
public class helloController {

    @RequestMapping("/hello")
    public String test(){
        return "hello,springboo1";
    }
    @RequestMapping("/he")
    public String tt(){

/*阿达柯尼卡*/
        return "hello,sp那份大部分";
    }


}
