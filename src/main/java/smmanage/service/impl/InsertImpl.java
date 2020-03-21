package smmanage.service.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import smmanage.dao.GoodsMapper;
import smmanage.entity.Goods;
import smmanage.service.Insert;
/**
 * 
 * @Title: InsertImpl
 * @Description:服务实体类，增加单个商品 
 * @author Hmoji
 * @date 2020年3月21日
 * @time 下午10:25:28
 */
@Service
@Transactional
public class InsertImpl implements Insert{
	ApplicationContext Context = new ClassPathXmlApplicationContext("applicationContext.xml");
	GoodsMapper goodsMapper=(GoodsMapper)Context.getBean("goodsMapper");
	public boolean InsertService(Goods goods) {
		try {
			boolean result=goodsMapper.insertGoods(goods);
			return result;
		} catch (Exception e) {
			return false;
		}
	}

}
