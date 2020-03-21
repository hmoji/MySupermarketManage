package smmanage.service;

import org.springframework.stereotype.Service;

import smmanage.entity.Staff;
/**
 * 
 * @Title: StaffSelect
 * @Description:服务层，查询单个员工信息
 * @author Hmoji
 * @date 2020年3月21日
 * @time 下午10:23:33
 */
@Service
public interface StaffSelect {
Staff staffselectservice(String name);
}
