package smmanage.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableLogic;

/**
 * 
 * @Title: Staff
 * @Description:实体层，映射数据库里的<code>staff</code>库
 * @author Hmoji
 * @date 2020年3月21日
 * @time 下午10:10:59
 */
public class Staff {
@TableId
private String name;
private String password;
private int level;
@TableLogic
private boolean flag;

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
public int getLevel() {
	return level;
}
public void setLevel(int level) {
	this.level = level;
}

public boolean isFlag() {
	return flag;
}
public void setFlag(boolean flag) {
	this.flag = flag;
}
@Override
public String toString() {
	return "Staff [name=" + name + ", password=" + password + ", level=" + level + "]";
}
}
