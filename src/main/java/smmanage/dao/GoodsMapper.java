package smmanage.dao;
import org.springframework.stereotype.Repository;

import smmanage.entity.Goods;

@Repository
public interface GoodsMapper {
		Goods queryGoodsByName(String name);
		boolean insertGoods(Goods goods);
		boolean update(Goods goods);
		boolean delete(String name);
}
