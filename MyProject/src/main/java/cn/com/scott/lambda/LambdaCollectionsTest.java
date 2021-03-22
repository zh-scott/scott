package cn.com.scott.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.com.scott.pojo.Item;


/**
 * @ClassName: LambdaCollectionsTest
 * @Description: lambda表达式集合操作
 * @Author zhuhao
 * @Date: 2021年3月10日 下午2:07:35
 */
public class LambdaCollectionsTest {

	public static void main(String[] args) {
		//遍历元素
		List<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, 1, 2, 3, 4, 5, 6);
		list.forEach(System.out::println);
		list.forEach(element -> {
			if (element % 2 == 0) {
				System.out.println(element);
			}
		});
		
		List<Map> list2 = new ArrayList<Map>();
		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("333", "222");
		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put("111", "222");
		Collections.addAll(list2, map1, map2);
		list2.forEach(System.out::println);
		list2.forEach((Map ele) -> {
			System.out.println(ele);
		});
		
		//删除元素
		List<Item> itemList = new ArrayList<Item>();
		itemList.add(new Item(1, "牙膏", 10));
		itemList.add(new Item(2, "牙刷", 3));
		itemList.add(new Item(3, "肥皂", 2));
		itemList.add(new Item(4, "冰箱", 4000));
		itemList.add(new Item(5, "电视", 5000));
		itemList.add(new Item(6, "空调", 3200));
		
		boolean result = itemList.removeIf(elemennt -> elemennt.getId() == 5);
		itemList.forEach(item -> System.out.println(item.getName()));
		System.out.println("\n");
		itemList.sort((o1, o2) -> {
			return (int) (o2.getPrice() - o1.getPrice());
		});
		itemList.forEach(item -> System.out.println(item.getName()));
	}

}
