package com.zh.swagger.controller;

import com.zh.swagger.config.bean.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhanghao
 * @date 2020/7/4 - 10:52
 */
@RestController
public class HelloController {

    @ApiOperation("hello接口")
    @GetMapping("/hello")
    public String sayhello(){
        return "hello";
    }


    @ApiOperation("helloUser接口")
    @PostMapping("/helloUser")
    public User helloUser(@ApiParam("用户") User user){
        return user;
    }
}
