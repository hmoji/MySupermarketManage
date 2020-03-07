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
	ApplicationContext Context = new ClassPathXmlApplicationContext("springConfig.xml");
	GoodsMapper goodsMapper=(GoodsMapper)Context.getBean("goodsMapper");
	public Goods selectservice(String name) {
		Goods goods=goodsMapper.queryGoodsByName(name);
		System.out.println(goods);
		return goods;
	}

}
