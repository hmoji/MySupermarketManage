package smmanage.service.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import smmanage.dao.GoodsMapper;
import smmanage.dao.StaffMapper;
import smmanage.entity.Staff;
import smmanage.service.StaffSelect;
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
