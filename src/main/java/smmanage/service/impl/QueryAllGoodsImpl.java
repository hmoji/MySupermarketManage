package smmanage.service.impl;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import smmanage.dao.GoodsMapper;
import smmanage.entity.Goods;
import smmanage.service.QueryAllGoods;

@Service
public class QueryAllGoodsImpl implements QueryAllGoods {
	
	public ArrayList<Goods> queryAllGoods() {
		ApplicationContext Context=new ClassPathXmlApplicationContext("applicationContext.xml");
		GoodsMapper mapper =(GoodsMapper) Context.getBean("goodsMapper");
		ArrayList<Goods> result= mapper.queryAllGoods();
		return result;
	}

}
