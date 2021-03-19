package com.example.delicious.dataobject;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class CulinaryTreasures {
    /*
    烹饪宝典
     */
    @Id
    private String culinaryId;
    /**
     *名称
     */
    private String delicacyName;
    /**
     * 图片
     */
    private String delicacyImg;
    /**
     * 详情
     */
    private String culinaryExplain;
    /**
     * 烹饪工具
     */
    private String culinaryTools;
    /**
     * 主料
     */
    private String culinaryMainMaterials;
    /**
     * 辅料
     */
    private String culinaryAccessories;
    /**
     * 调料
     */
    private String culinarySeasoning;
    /**
     * 菜系
     */
    private String delicacyDepartment;
}
