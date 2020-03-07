package smmanage.service.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import smmanage.dao.GoodsMapper;
import smmanage.service.Update;

public class UpdateImpl implements Update {
	ApplicationContext Context = new ClassPathXmlApplicationContext("springConfig.xml");
	GoodsMapper goodsMapper=(GoodsMapper)Context.getBean("goodsMapper");
	public boolean updatePriceService(String name, int price) {
		try {
			goodsMapper.updatePrice(name, price);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean updateNumberService(String name, int number) {
		try {
			goodsMapper.updateNumber(name, number);
			return true;
		} catch (Exception e) {
			return false;
		}
	}



}
