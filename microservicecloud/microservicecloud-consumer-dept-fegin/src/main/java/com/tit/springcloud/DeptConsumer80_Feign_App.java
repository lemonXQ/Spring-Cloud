package com.tit.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@EnableEurekaClient    // 开启客户端注册进入到erureka服务中
@SpringBootApplication
@EnableFeignClients(basePackages= {"com.tit.springcloud"}) //开启Feign负载均衡
@ComponentScan("com.tit.springcloud")
public class DeptConsumer80_Feign_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_Feign_App.class,args);
    }
}
