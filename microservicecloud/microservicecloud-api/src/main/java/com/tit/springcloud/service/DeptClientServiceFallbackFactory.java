package com.tit.springcloud.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.tit.springcloud.entity.Dept;

import feign.hystrix.FallbackFactory;

/**
 * @ClassName:  DeptClientServiceFallbackFactory 
 * @author:     卧雪钓月
 * @Description:TODO(这里用一句话描述这个类的作用)  
 * @date:       2019年8月9日 上午10:32:57   
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService>{

    @Override
    public DeptClientService create(Throwable cause) {
        
        return new DeptClientService() {
            
            @Override
            public Dept get(long id) {
                Dept dept = new Dept("该ID" + id + "没有对应的信息，Consumer客户端提供的降级信息，此刻服务暂停。");
                return dept;
            }

            @Override
            public List<Dept> list() {
                return null;
            }

            @Override
            public boolean add(Dept dept) {
                return false;
            }
        };
    }

}
