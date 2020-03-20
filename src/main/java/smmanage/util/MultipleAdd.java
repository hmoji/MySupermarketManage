package smmanage.util;

import org.springframework.transaction.annotation.Transactional;

import smmanage.entity.Goods;
import smmanage.service.impl.InsertImpl;

@Transactional
public class MultipleAdd {
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
