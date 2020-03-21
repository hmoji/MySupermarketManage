package smmanage.service.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import smmanage.dao.GoodsMapper;
import smmanage.entity.Goods;
import smmanage.service.Select;

/**
 * 
 * @Title: SelectImpl
 * @Description:服务实体类，查询单个商品 
 * @author Hmoji
 * @date 2020年3月21日
 * @time 下午10:26:44
 */

@Service
public class SelectImpl implements Select {
	ApplicationContext Context = new ClassPathXmlApplicationContext("applicationContext.xml");
	GoodsMapper goodsMapper=(GoodsMapper)Context.getBean("goodsMapper");
	public Goods selectservice(String name) {
		Goods goods=goodsMapper.queryGoodsByName(name);
		System.out.println(goods);
		return goods;
	}

}
