package smmanage.service;

import org.springframework.stereotype.Service;

import smmanage.entity.Goods;
/**
 * 
 * @Title: Select
 * @Description:服务层，查询单个商品 
 * @author Hmoji
 * @date 2020年3月21日
 * @time 下午10:23:07
 */
@Service
public interface Select {
Goods selectservice(String name);
}
