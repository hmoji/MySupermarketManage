package smmanage.dao;

import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.mapper.BaseMapper;

import smmanage.entity.Staff;
/**
 * 
 * @Title: StaffMapper
 * @Description:DAO层，管理员工的操作 
 * @author Hmoji
 * @date 2020年3月21日
 * @time 下午10:10:09
 * 
 * 2020年3月23日14:49:02  使用mybatis-plus，继承BaseMapper
 */
@Repository
public interface StaffMapper extends BaseMapper<Staff>{
	public Staff staffselect(String name);
}