package com.example.delicious.dataobject;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/*
美食浏览
 */
@Entity
@Data
public class DelicacyDetail {

    @Id
    private String detailId;
    /**
     * 名称
     */
    private String delicacyName;
    /**
     * 图片
     */
    private String delicacyImg;
    /**
     * 简介
     */
    private String delicacyExplain;
    /**
     * 类型
     */
    private String delicacyType;
    /**
     * 菜系
     */
    private String delicacyDepartment;
}
