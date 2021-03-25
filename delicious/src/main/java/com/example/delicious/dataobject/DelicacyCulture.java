package com.example.delicious.dataobject;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * 美食文化
 */
@Data
@Entity
@NoArgsConstructor
@DynamicUpdate
public class DelicacyCulture {
    /**
     * Id
     */
    @Id
    private String cultureId;
    /**
     * 菜系
     */
    private String cultureName;
    /**
     * 风格
     */
    private String cultureStyle;
    /**
     * 代表食品
     */
    private String foodName;
    /**
     * 代表食品图片
     */
    private String img;
    /**
     * 创建时间
     */
    private Date createTime;



    public DelicacyCulture(String cultureName,String cultureStyle) {
        this.cultureName = cultureName;
        this.cultureStyle = cultureStyle;
    }
}
