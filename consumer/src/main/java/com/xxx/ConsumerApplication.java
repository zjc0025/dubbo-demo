package com.xxx;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName com.xxx.ConsumerApplication
 * @Description
 * @Author ZJC
 * @Date 2019/9/16 9:49
 */
@SpringBootApplication
@EnableDubbo
@ComponentScan("com.xxx")
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
