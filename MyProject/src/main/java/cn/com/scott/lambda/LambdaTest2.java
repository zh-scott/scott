package cn.com.scott.lambda;

import cn.com.scott.base.ItemCreatorBlankConstruct;
import cn.com.scott.base.ItemCreatorParamContruct;
import cn.com.scott.pojo.Item;

/**
 * @ClassName: LambdaTest2
 * @Description: jdk8 labmda表达式测试类
 * @Author zhuhao
 * @Date: 2021年3月10日 上午11:03:12
 */
public class LambdaTest2 {
	public static void main(String[] args) {
		ItemCreatorBlankConstruct creator = () -> new Item();
		Item item = creator.getItem();
		
		ItemCreatorBlankConstruct creator2 = Item::new;
		Item item2 = creator2.getItem();
		
		ItemCreatorParamContruct creator3 = (a, b, c) -> new Item(a, b, c);
		Item item3 = creator3.getItem(12, "鼠标", 300.00);
		
		ItemCreatorParamContruct creator4 = Item::new;
		Item item4 = creator4.getItem(13, "键盘", 1320.00);
		
	}
}
