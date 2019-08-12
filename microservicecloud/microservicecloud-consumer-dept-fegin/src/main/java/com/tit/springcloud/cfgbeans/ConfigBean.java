package com.tit.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;


/**
 * @ClassName:  ConfigBean 
 * @author:     卧雪钓月
 * @Description:TODO(这里用一句话描述这个类的作用)  
 * @date:       2019年8月7日 下午4:33:44   
 */

@Configuration
public class ConfigBean {   // boot -> spring  applicationContext.xml ---- @Configuration 配置。 ConfigBean == applicationContext.xml

    /**
     * RestTemplate 提供了多种便捷访问远程http服务的方法
     * 是一种简单便捷的访问restful服务模板类，是Spring提供的用于访问REST服务的客户端模板工具集
     * @return
     */
    @Bean
    @LoadBalanced    // Spring cloud Ribbon 是基于Netflix Ribbon 实现的一套客户端， 负载均衡的工具
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
  
    @Bean
    public IRule myRule(){
//        return new RandomRule(); // 达到的目的，用我们重新选择的随机算法替代默认的轮询
        return new RetryRule();
    }

}
/**
 * @Bean
 * public UserService
 */
// applicationContext.xml == ConfigBean(@Configuration)
// <bean id="userService" class="cn.fllday.zhdy.service.UserServiceImpl" />
