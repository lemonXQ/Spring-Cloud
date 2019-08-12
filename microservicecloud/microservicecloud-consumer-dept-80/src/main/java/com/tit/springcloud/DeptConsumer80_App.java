package com.tit.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.tit.myrule.MyselfRule;

@EnableEurekaClient    // 开启客户端注册进入到erureka服务中
@SpringBootApplication
@RibbonClient(name="microservicecloud-dept",configuration=MyselfRule.class)
public class DeptConsumer80_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_App.class,args);
    }
}
