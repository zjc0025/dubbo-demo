package com.xxx.controller;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pub.OrderService;

import java.util.List;

/**
 * @ClassName DubboTestController
 * @Description
 * @Author ZJC
 * @Date 2019/9/16 10:20
 */
@RestController
public class DubboTestController {

    @Autowired
    OrderService orderService;

    @GetMapping("/userInfo/{userName}")
    public List<User> getUserInfo(@PathVariable String userName){
        return orderService.initOrder(userName);
    }


}
