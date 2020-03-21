package smmanage.dao;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import smmanage.entity.Goods;
/**
 * 
 * @Title: GoodsMapper
 * @Description:DAO层，管理关于商品的各个操作 
 * @author Hmoji
 * @date 2020年3月21日
 * @time 下午10:09:01
 */
@Repository
public interface GoodsMapper {
		Goods queryGoodsByName(String name);
		boolean insertGoods(Goods goods);
		boolean update(Goods goods);
		boolean delete(String name);
		ArrayList<Goods> queryAllGoods();
}
