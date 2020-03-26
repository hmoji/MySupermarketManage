package smmanage.dao;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.mapper.BaseMapper;

import smmanage.entity.Goods;
/**
 * 
 * @Title: GoodsMapper
 * @Description:DAO层，管理关于商品的各个操作 
 * @author Hmoji
 * @date 2020年3月21日
 * @time 下午10:09:01
 * 
 * 2020年3月23日14:49:02  使用mybatis-plus，继承BaseMapper
 */
@Repository
public interface GoodsMapper extends BaseMapper<Goods>{
		Goods queryGoodsByName(String name);
		boolean insertGoods(Goods goods);
		boolean update(Goods goods);
		ArrayList<Goods> queryAllGoods();
}
