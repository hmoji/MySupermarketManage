package smmanage.service.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import smmanage.dao.GoodsMapper;
import smmanage.dao.StaffMapper;
import smmanage.entity.Staff;
import smmanage.service.StaffSelect;

/**
 * 
 * @Title: StaffSelectImpl
 * @Description:服务实体类，查询单个员工 
 * @author Hmoji
 * @date 2020年3月21日
 * @time 下午10:27:04
 */

@Service
@Transactional
public class StaffSelectImpl implements StaffSelect {
	ApplicationContext Context = new ClassPathXmlApplicationContext("applicationContext.xml");
	StaffMapper staffmapper=(StaffMapper)Context.getBean("staffMapper");
	public Staff staffselectservice(String name) {
		Staff result=staffmapper.staffselect(name);
		return result;
	}

}
