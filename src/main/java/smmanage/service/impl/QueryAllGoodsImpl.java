package smmanage.service.impl;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import smmanage.dao.GoodsMapper;
import smmanage.entity.Goods;
import smmanage.service.QueryAllGoods;
/**
 * 
 * @Title: QueryAllGoodsImpl
 * @Description:服务实体类，查询所有商品 
 * @author Hmoji
 * @date 2020年3月21日
 * @time 下午10:26:08
 */
@Service
public class QueryAllGoodsImpl implements QueryAllGoods {
	
	public ArrayList<Goods> queryAllGoods() {
		ApplicationContext Context=new ClassPathXmlApplicationContext("applicationContext.xml");
		GoodsMapper mapper =(GoodsMapper) Context.getBean("goodsMapper");
		ArrayList<Goods> result= mapper.queryAllGoods();
		return result;
	}

}
