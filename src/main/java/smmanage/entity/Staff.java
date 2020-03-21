package smmanage.entity;
/**
 * 
 * @Title: Staff
 * @Description:实体层，映射数据库里的<code>staff</code>库
 * @author Hmoji
 * @date 2020年3月21日
 * @time 下午10:10:59
 */
public class Staff {
private String name;
private String password;
private int level;
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
@Override
public String toString() {
	return "Staff [name=" + name + ", password=" + password + ", level=" + level + "]";
}
}
