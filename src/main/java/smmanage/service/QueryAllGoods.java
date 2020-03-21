package smmanage.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import smmanage.entity.Goods;
/**
 * 
 * @Title: QueryAllGoods
 * @Description:服务层，查询所有商品 
 * @author Hmoji
 * @date 2020年3月21日
 * @time 下午10:22:35
 */
@Service
public interface QueryAllGoods {
	ArrayList<Goods> queryAllGoods();
}
