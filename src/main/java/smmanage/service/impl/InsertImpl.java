package smmanage.service.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import smmanage.dao.GoodsMapper;
import smmanage.entity.Goods;
import smmanage.service.Insert;
@Service
public class InsertImpl implements Insert{
	ApplicationContext Context = new ClassPathXmlApplicationContext("springConfig.xml");
	GoodsMapper goodsMapper=(GoodsMapper)Context.getBean("goodsMapper");
	public boolean InsertService(Goods goods) {
		try {
			goodsMapper.insertGoods(goods);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
