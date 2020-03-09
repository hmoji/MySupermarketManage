package smmanage.service.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import smmanage.dao.GoodsMapper;
import smmanage.entity.Goods;
import smmanage.service.Insert;
@Service
public class InsertImpl implements Insert{
	ApplicationContext Context = new ClassPathXmlApplicationContext("applicationContext.xml");
	GoodsMapper goodsMapper=(GoodsMapper)Context.getBean("goodsMapper");
	public boolean InsertService(Goods goods) {
		try {
			boolean result=goodsMapper.insertGoods(goods);
			return result;
		} catch (Exception e) {
			return false;
		}
	}

}
