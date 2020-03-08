package smmanage.service.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import smmanage.dao.GoodsMapper;
import smmanage.service.Delete;

public class DeleteImpl implements Delete{
	ApplicationContext Context = new ClassPathXmlApplicationContext("springConfig.xml");
	GoodsMapper goodsMapper=(GoodsMapper)Context.getBean("goodsMapper");
	public boolean DeleteSrevice(String name) {
		try {
			goodsMapper.delete(name);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
