package smmanage.util;

import smmanage.entity.Goods;

public class ToGood {
	public Goods[] toGood(String...strings){
		Goods[] goods=new Goods[strings.length];
		for (int i = 0; i < goods.length; i++) {
			goods[i]=new Goods();
		}
		int i=0;
		for (String string : strings) {
			String[] temp=string.split("-");
			goods[i].setName(temp[0]);
			goods[i].setNumber(Integer.valueOf(temp[1]));
			goods[i].setPrice(Integer.valueOf(temp[2]));
			i++;
		}
		return goods;
	}
}
