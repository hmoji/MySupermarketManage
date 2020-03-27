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
public class Staff extends Model<Staff> {

    private static final long serialVersionUID = 1L;

    private String name;
    private String password;
    private Integer level;
    private Integer flag;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "Staff{" +
        ", name=" + name +
        ", password=" + password +
        ", level=" + level +
        ", flag=" + flag +
        "}";
    }
}
