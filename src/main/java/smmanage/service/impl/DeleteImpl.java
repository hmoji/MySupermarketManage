package smmanage.service.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import smmanage.dao.GoodsMapper;
import smmanage.service.Delete;
@Service
@Transactional
public class DeleteImpl implements Delete{
	ApplicationContext Context = new ClassPathXmlApplicationContext("applicationContext.xml");
	GoodsMapper goodsMapper=(GoodsMapper)Context.getBean("goodsMapper");
	public boolean DeleteSrevice(String name) {
		try {
			boolean result=goodsMapper.delete(name);
			return result;
		} catch (Exception e) {
			return false;
		}
	}
}
