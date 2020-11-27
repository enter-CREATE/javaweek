package com.company.springbootsell.dataobject;

import com.company.springbootsell.enums.ProductStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品详情
 */
@Entity
@Data
@DynamicUpdate
public class ProductInfo {

    @Id
    //商品id
    private String productId;
    //商品名称
    private String productName;
    //单价
    private BigDecimal productPrice;
    //库存
    private Integer productStock;
    //描述
    private String productDescription;
    //图片
    private String productIcon;
    //状态 0正常 1已下架
    private Integer productStatus = ProductStatusEnum.UP.getCode();
    //类目编号
    private Integer categoryType;
    //创建时间
    private Date createTime;
    //更新时间
    private Date updateTime;
}
