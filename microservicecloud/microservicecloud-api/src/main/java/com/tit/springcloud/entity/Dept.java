package com.tit.springcloud.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @ClassName:  Dept 
 * @author:     卧雪钓月
 * @Description:TODO(这里用一句话描述这个类的作用)  
 * @date:       2019年8月7日 下午2:12:59   
 */
@SuppressWarnings("serial")
@NoArgsConstructor
@Data
@Accessors(chain=true)
public class Dept implements Serializable{
    private Long deptno;    //主键
    private String dname;    //部门名称
    private String db_source;  //来源数据库，因为微服务架构 可以一个服务对应 一个数据库，同一个信息被存储到不同数据库

    public Dept(String dname) {
        super();
        this.dname = dname;
    }
    
/*    
 * 链式写法 在实体类上加上  @Accessors(chain=true)
   public static void main(String[] args) {
        Dept dep = new Dept();
        dep.setDb_source("").setDeptno(123L).setName("部门");
        
    }
*/    
}
