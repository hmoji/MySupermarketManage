/**
 * 
 */
package smmanage.service.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import smmanage.dao.GoodsMapper;

/**
 * @Title: DeleteImpl
 * @Description:TODO 
 * @author Hmoji
 * @date 2020年3月26日
 * @time 上午11:27:03
 */
@Service
@Transactional
public class DeleteImpl {
	ApplicationContext Context = new ClassPathXmlApplicationContext("applicationContext.xml");
	GoodsMapper goodsMapper=(GoodsMapper)Context.getBean("goodsMapper");
	public Integer delete(String id) {
		return goodsMapper.deleteById(id);
	}
}
