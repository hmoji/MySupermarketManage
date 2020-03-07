package smmanage.dao;
import smmanage.entity.Goods;

public interface GoodsMapper {
		Goods queryGoodsByName(String name);
		void insertGoods(Goods goods);
		void update(Goods goods);
}
