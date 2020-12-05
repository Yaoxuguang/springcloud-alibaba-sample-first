package com.yao.springcloudalibabanacosconsumer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author: <a href="tivenninesongs@163.com">yaoxuguang</a>
 * @createDate: Created in 2020/9/10 11:13
 */
@RestController
@Slf4j
public class NacosConsumerController {
    private final RestTemplate restTemplate;
    @Autowired
    public NacosConsumerController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping(value = "/echo/{str}")
    public String get(@PathVariable(name = "str") String string){
        log.info("nacos consumer ....");
        return restTemplate.getForObject("http://nacos-provider/echo/" + string,String.class);
    }
}
