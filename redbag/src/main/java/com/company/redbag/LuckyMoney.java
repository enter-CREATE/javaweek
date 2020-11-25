package com.company.redbag;

//import jdk.nashorn.internal.objects.annotations.Getter;
//import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * LuckMoney是与数据表中字段一一对应的实体类
 * JavaBean格式
 */
@Entity
@Data
public class LuckyMoney {
    //@Data lombok插件的一个注解，表示此注解的实体类不用写set，get方法
    //@Entity指定该类为实体类，@Id代表主键,@GeneratedValue自增长
    @Id
    @GeneratedValue
    private Integer id;
    //红包金额
    private BigDecimal money;
    //发红包的人
    private String producer;
    //收红包的人
    private String consumer;
    public LuckyMoney(){

    }

}
