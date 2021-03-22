package cn.com.scott.lambda;

import java.util.function.Consumer;

/**
 * @ClassName: LambdaConsumerTest
 * @Description: 
 * @Author zhuhao
 * @Date: 2021年3月10日 下午3:23:16
 */
public class LambdaConsumerTest {

	public static void main(String[] args) {
		int num = 10;
        Consumer<String> consumer = ele -> {
            System.out.println(num);
        };

        //num默认加上final修饰符
//        num = num + 2;
        consumer.accept("hello");
	}

}
