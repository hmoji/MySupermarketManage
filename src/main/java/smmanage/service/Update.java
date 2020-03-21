package smmanage.service;

import org.springframework.stereotype.Service;

import smmanage.entity.Goods;
/**
 * 
 * @Title: Update
 * @Description:服务层，修改单个商品信息 
 * @author Hmoji
 * @date 2020年3月21日
 * @time 下午10:24:09
 */
@Service
public interface Update {
	boolean update(Goods goods);
}
