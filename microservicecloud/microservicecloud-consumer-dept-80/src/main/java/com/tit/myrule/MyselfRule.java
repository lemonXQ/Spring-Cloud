package com.tit.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;

/**
 * @ClassName:  MyselfRule 
 * @author:     卧雪钓月
 * @Description:TODO(这里用一句话描述这个类的作用)  
 * @date:       2019年8月8日 下午3:44:49   
 */
@Configuration
public class MyselfRule {
    
    @Bean
    public IRule myRule(){
//        return new RandomRule(); // 随机算法替代默认的轮询
//        return new RetryRule();
//        return new RoundRobinRule();
        return new RandomRule_ZY(); //自定义每台机器五次
    }
}
