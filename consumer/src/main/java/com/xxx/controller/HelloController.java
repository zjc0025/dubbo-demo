package com.xxx.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description
 * @Author ZJC
 * @Date 2019/9/16 13:38
 */
@RestController
@NacosPropertySource(dataId = "database",groupId = "DEFAULT_GROUP",autoRefreshed = true)
public class HelloController {

    @NacosValue(value = "${abc}",autoRefreshed = true)
//    @Value("${nacos.config.namespace}")
    private String abc;

    @GetMapping("/abc")
    public String hello(){
        return abc;
    }



}
