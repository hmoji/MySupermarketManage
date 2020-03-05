package smmanage.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import smmanage.dao.GoodsMapper;
import smmanage.entity.Goods;

public class Test {
public static void main(String[] args) {
	ApplicationContext Context = new ClassPathXmlApplicationContext("springConfig.xml");
	GoodsMapper goodsMapper=(GoodsMapper)Context.getBean("goodsMapper");
	Goods goods=goodsMapper.queryGoodsByName("test");
	System.out.println(goods);
}
}	
