package cn.com.scott.lambda;

/**
 * @ClassName: LambdaThreadTest
 * @Description: jdk8 labmda表达式线程测试类
 * @Author zhuhao
 * @Date: 2021年3月10日 上午11:15:47
 */
public class LambdaThreadTest {
	public static void main(String[] args) {
		//匿名内部类重写run方法
		Thread thread = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10; i ++) {
					System.out.println("普通线程测试" + i);
				}
				
			}
		});
		Thread thread1 = new Thread(() -> {
			for (int i = 0; i < 10; i ++) {
				System.out.println("lambda表达式创建线程" + i);
			}
		});
		thread.start();
		thread1.start();
		
	}
}
