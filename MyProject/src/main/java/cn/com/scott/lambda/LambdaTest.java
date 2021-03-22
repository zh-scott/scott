package cn.com.scott.lambda;

import cn.com.scott.base.NoReturnMultiParam;
import cn.com.scott.base.NoReturnNoParam;
import cn.com.scott.base.NoReturnOneParam;
import cn.com.scott.base.ReturnMultiParam;
import cn.com.scott.base.ReturnNoParam;
import cn.com.scott.base.ReturnOneParam;

/**
 * @ClassName: LambdaTest
 * @Description: jdk8 labmda表达式测试类
 * @Description: 省略接口具体实现类
 * @Author zhuhao
 * @Date: 2021年3月10日 上午9:52:58
 */
public class LambdaTest {
	public static void main(String[] args) {
		NoReturnMultiParam noReturnMultiParam = (int a, int b) -> {
			System.out.println("a=" + a + ", b=" + b);
		};
		noReturnMultiParam.method(3, 4);
		
		//方法体只有一条语句可以省略大括号
		NoReturnNoParam NoReturnNoParam = () -> System.out.println("无参数");
		NoReturnNoParam.method();
		
		NoReturnOneParam noReturnOneParam = a -> {
			System.out.println("a=" + a);
		};
		noReturnOneParam.method(6);
		
		//不写参数类型时，所有参数类型都需要省略
		ReturnMultiParam returnMultiParam = (a, b) -> {
			return a + b;
		};
		System.out.println(returnMultiParam.method(1, 2));
		
		//只有一条return语句时，大括号和return都可以省略
		ReturnOneParam returnOneParam = (a) -> a + 5;
		System.out.println(returnOneParam.method(13));
		
		ReturnNoParam returnNoParam = () -> 3;
		System.out.println(returnNoParam.method());
		
		//调用单参数的静态方法doubleNum
		ReturnOneParam returnOneParam2 = LambdaTest::doubleNum;
		System.out.println(returnOneParam2.method(4));
		
		//调用多参数的静态方法doubleNum
		ReturnMultiParam returnMultiParam2 = LambdaTest::doubleNum;
		System.out.println(returnMultiParam2.method(7, 2));
		
		//调用单参数的非静态方法addNumber
		LambdaTest lambda = new LambdaTest();
		ReturnOneParam returnOneParam3 = lambda::addNum;
		System.out.println(returnOneParam3.method(7));
		
	}
	
	private static int doubleNum(int a) {
		return a * 2;
	}
	
	private static int doubleNum(int a, int b) {
		return a * b;
	}
	
	private int addNum(int a) {
		return a + 3;
	}
}
