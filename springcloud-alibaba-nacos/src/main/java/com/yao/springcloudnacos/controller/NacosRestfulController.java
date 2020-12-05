package com.yao.springcloudnacos.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: <a href="tivenninesongs@163.com">yaoxuguang</a>
 * @createDate: Created in 2020/9/9 20:47
 */
@RestController
@Slf4j
public class NacosRestfulController {
    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable String string){
        log.info("nacos provider ...");
        return "Hello Nacos Discovery :" + string;
    }
}
