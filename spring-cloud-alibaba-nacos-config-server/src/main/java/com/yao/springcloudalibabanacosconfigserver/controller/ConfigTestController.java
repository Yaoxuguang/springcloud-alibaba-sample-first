package com.yao.springcloudalibabanacosconfigserver.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: <a href="tivenninesongs@163.com">yaoxuguang</a>
 * @createDate: Created in 2020/9/30 15:58
 */
@RestController
@RefreshScope
public class ConfigTestController {
    @Value("${user.name}")
    private String name;
    @Value("${user.age}")
    private String age;

    @GetMapping("/config")
    public String testConfig() {
        return "nacos config value: name-->" + name + ",age-->" + age;
    }
}
