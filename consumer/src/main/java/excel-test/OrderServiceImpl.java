package com.xxx.service;

import com.alibaba.dubbo.config.annotation.Reference;
import model.User;
import org.springframework.stereotype.Service;
import pub.OrderService;
import pub.UserService;

import java.util.List;

/**
 * @ClassName OrderServiceImpl
 * @Description
 * @Author ZJC
 * @Date 2019/9/16 10:00
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Reference
    UserService userService;


    public List<User> initOrder(String userName) {
        return userService.getUserInfo(userName);
    }
}
