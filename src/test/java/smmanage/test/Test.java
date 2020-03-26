package smmanage.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import smmanage.dao.GoodsMapper;
import smmanage.entity.Goods;

public class Test {
public static void main(String[] args) {
	ApplicationContext Context = new ClassPathXmlApplicationContext("applicationContext.xml");
	GoodsMapper goodsMapper=Context.getBean("goodsMapper",GoodsMapper.class);
	Integer result=goodsMapper.deleteById("测试1");
	System.out.println(result);
}
}
