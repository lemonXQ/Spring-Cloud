package com.tit.springcloud.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tit.springcloud.entity.Dept;


/**
 * @ClassName:  DeptClientService 
 * @author:     卧雪钓月
 * @Description:TODO(这里用一句话描述这个类的作用)  
 * @date:       2019年8月8日 下午4:58:43   
 */
@FeignClient(value = "microservicecloud-dept",fallbackFactory=DeptClientServiceFallbackFactory.class)
public interface DeptClientService {
    
    @RequestMapping(value = "dept/get/{id}",method = RequestMethod.GET)
    public Dept get(@PathVariable("id")long id);

    @RequestMapping(value = "dept/list",method = RequestMethod.GET)
    public List<Dept> list();

    @RequestMapping(value = "dept/add",method = RequestMethod.POST)
    public boolean add(Dept dept);


}
