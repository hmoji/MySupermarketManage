package smmanage.dao;

import org.springframework.stereotype.Repository;

import smmanage.entity.Staff;
/**
 * 
 * @Title: StaffMapper
 * @Description:DAO层，管理员工的操作 
 * @author Hmoji
 * @date 2020年3月21日
 * @time 下午10:10:09
 */
@Repository
public interface StaffMapper {
	public Staff staffselect(String name);
}