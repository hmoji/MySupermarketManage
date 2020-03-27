package com.smmanage.bean;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Hmoji
 * @since 2020-03-27
 */
public class Goods extends Model<Goods> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "name", type = IdType.UUID)
    private String name;
    private Integer price;
    private Integer number;
    private Integer flag;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    @Override
    protected Serializable pkVal() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Goods{" +
        ", name=" + name +
        ", price=" + price +
        ", number=" + number +
        ", flag=" + flag +
        "}";
    }
}
