package smmanage.dao;
import org.springframework.stereotype.Repository;

import smmanage.entity.Goods;

@Repository
public interface GoodsMapper {
		Goods queryGoodsByName(String name);
		void insertGoods(Goods goods);
		void update(Goods goods);
		void delete(String name);
}
