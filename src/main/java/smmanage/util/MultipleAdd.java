package smmanage.util;

import org.springframework.transaction.annotation.Transactional;

import smmanage.entity.Goods;
import smmanage.service.impl.InsertImpl;

/**
 * 使用事务管理
 * 
 * @Title: MultipleAdd
 * @Description:批量增加多个商品
 * @author Hmoji
 * @date 2020年3月21日
 * @time 下午10:27:56
 * 
 */

@Transactional
public class MultipleAdd {
	/**
	 * 
	 * @return_type: boolean
	 * @Description:批量增加多个商品 
	 * @author Hmoji
	 * @date 2020年3月21日
	 * @time 下午10:37:40
	 * @see InsertImpl
	 */
	public static boolean multipleAdd(Goods... goods) {
		try {
			InsertImpl insert = new InsertImpl();
			for (Goods goods2 : goods) {
				insert.InsertService(goods2);
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
