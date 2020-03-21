package smmanage.service.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import smmanage.dao.GoodsMapper;
import smmanage.entity.Goods;
import smmanage.service.Update;

/**
 * 
 * @Title: UpdateImpl
 * @Description:服务实体类，修改单个商品信息 
 * @author Hmoji
 * @date 2020年3月21日
 * @time 下午10:27:32
 */

@Service
@Transactional
public class UpdateImpl implements Update {
	ApplicationContext Context = new ClassPathXmlApplicationContext("applicationContext.xml");
	GoodsMapper goodsMapper=(GoodsMapper)Context.getBean("goodsMapper");
	public boolean update(Goods goods) {
		try {
			boolean result=goodsMapper.update(goods);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
	}
	}
}