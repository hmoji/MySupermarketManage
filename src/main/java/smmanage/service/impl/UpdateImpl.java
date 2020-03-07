package smmanage.service.impl;

import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import smmanage.dao.GoodsMapper;
import smmanage.entity.Goods;
import smmanage.service.Update;
@Service
@Resource
public class UpdateImpl implements Update {
	ApplicationContext Context = new ClassPathXmlApplicationContext("springConfig.xml");
	GoodsMapper goodsMapper=(GoodsMapper)Context.getBean("goodsMapper");
	public boolean update(Goods goods) {
		try {
			goodsMapper.update(goods);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
	}
	}
}