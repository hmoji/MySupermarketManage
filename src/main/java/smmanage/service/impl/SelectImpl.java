package smmanage.service.impl;

import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import smmanage.dao.GoodsMapper;
import smmanage.entity.Goods;
import smmanage.service.Select;
@Service
@Resource
public class SelectImpl implements Select {

	public void selectservice() {
		ApplicationContext Context = new ClassPathXmlApplicationContext("springConfig.xml");
		GoodsMapper goodsMapper=(GoodsMapper)Context.getBean("goodsMapper");
		Goods goods=goodsMapper.queryGoodsByName("test");
		System.out.println(goods);
	}
}
