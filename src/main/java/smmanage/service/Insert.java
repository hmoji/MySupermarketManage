package smmanage.service;

import org.springframework.stereotype.Service;

import smmanage.entity.Goods;
/**
 * 
 * @Title: Insert
 * @Description:服务层，插入单个商品 
 * @author Hmoji
 * @date 2020年3月21日
 * @time 下午10:22:04
 */
@Service
public interface Insert {
boolean InsertService(Goods goods);
}
