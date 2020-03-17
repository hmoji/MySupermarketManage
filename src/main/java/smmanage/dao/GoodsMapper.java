package smmanage.dao;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import smmanage.entity.Goods;

@Repository
public interface GoodsMapper {
		Goods queryGoodsByName(String name);
		boolean insertGoods(Goods goods);
		boolean update(Goods goods);
		boolean delete(String name);
		ArrayList<Goods> queryAllGoods();
}
