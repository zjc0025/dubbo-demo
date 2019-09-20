package com.xxx.service;

import com.alibaba.dubbo.config.annotation.Service;
import model.User;
import org.springframework.stereotype.Component;
import pub.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName UserServiceImpl
 * @Description
 * @Author ZJC
 * @Date 2019/9/16 10:00
 */
@Service
@Component
public class UserServiceImpl implements UserService {

    public List<User> getUserInfo(String userName) {
        List<User> list = new ArrayList<User>();
        list.add(new User("Tom", 11, "male"));
        list.add(new User("AM", 12, "female"));
        return list;
    }

    public void sayHello() {
        System.out.println("Hello dubbo!!!");
    }
}
