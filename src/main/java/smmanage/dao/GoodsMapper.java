package smmanage.dao;
import smmanage.entity.Goods;

public interface GoodsMapper {
		Goods queryGoodsByName(String name);
}
