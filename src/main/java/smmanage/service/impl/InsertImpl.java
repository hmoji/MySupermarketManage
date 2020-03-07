package smmanage.service.impl;

import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import smmanage.dao.GoodsMapper;
import smmanage.entity.Goods;
import smmanage.service.Insert;
@Service
@Resource
public class InsertImpl implements Insert{

	public boolean InsertService(Goods goods) {
		try {
			ApplicationContext Context = new ClassPathXmlApplicationContext("springConfig.xml");
			GoodsMapper goodsMapper=(GoodsMapper)Context.getBean("goodsMapper");
			goodsMapper.insertGoods(goods);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
