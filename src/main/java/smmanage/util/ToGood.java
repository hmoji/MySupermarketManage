package smmanage.util;

import smmanage.entity.Goods;


/**
 * 
 * @Title: ToGood	
 * @Description:String到Good的类型转化
 * @author Hmoji
 * @date 2020年3月21日
 * @time 下午10:30:16
 */

public class ToGood {
	/**
	 * 将<code>String</code>类型的数据转化成<code>Good</code> 
	 * 先创建一个与<code>String</code>数组等长的<code>Good</code>数组，
	 * 然后通过循环将<code>Good</code>数组中的各个元素实体化，
	 * 在通过循环将数组中的<code>good</code>内的属性逐个设置
	 * @return_type: Goods[]
	 * @Description:String到Good的类型转化
	 * @author Hmoji
	 * @date 2020年3月21日
	 * @time 下午10:36:26
	 */
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
