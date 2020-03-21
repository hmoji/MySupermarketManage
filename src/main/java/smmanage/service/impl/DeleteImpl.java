package smmanage.service.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import smmanage.dao.GoodsMapper;
import smmanage.service.Delete;

/**
 * 
 * @Title: DeleteImpl
 * @Description:服务实体类，删除单个商品
 * @author Hmoji
 * @date 2020年3月21日
 * @time 下午10:24:37
 */
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
