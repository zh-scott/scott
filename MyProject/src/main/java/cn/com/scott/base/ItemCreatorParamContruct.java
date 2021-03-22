package cn.com.scott.base;

import cn.com.scott.pojo.Item;


/**
 * @ClassName: ItemCreatorParamContruct
 * @Description: 有参构造函数接口
 * @Author zhuhao
 * @Date: 2021年3月10日 上午10:54:29
 */
public interface ItemCreatorParamContruct {
	Item getItem(int id, String name, double price);
}
