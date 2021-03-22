package cn.com.scott.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import cn.com.scott.pojo.Student;

/**
 * @ClassName: SerializeTest
 * @Description: 序列化与反序列化实例
 * @Author zhuhao
 * @Date: 2021年3月10日 下午4:01:22
 */
public class SerializeTest {

	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		serilize();
		deserilize();
	}

	public static void serilize() throws FileNotFoundException, IOException {
		Student student = new Student();
		student.setAge(18);
		student.setName("小明");
		student.setScore(100);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("D:\\student.txt")));
		oos.writeObject(student);
		oos.close();
		System.out.println("序列化成功！已经生成student.txt文件");
	    System.out.println("==============================================");
	    
	    //单例对象序列化
	    ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream(new File("D:\\sigletonStudent.txt")));
		oos2.writeObject(Student.getInstance());
		oos2.close();
		System.out.println("单例对象序列化成功！已经生成sigletonStudent.txt文件");
	    System.out.println("==============================================");
	}
	
	public static void deserilize() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("D:\\student.txt")));
		Student student = (Student) ois.readObject();
		ois.close();
		System.out.println("反序列化结果为：");
	    System.out.println(student);
	    
	    ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream(new File("D:\\student.txt")));
		Student student2 = (Student) ois2.readObject();
		ois2.close();
		System.out.println(Student.getInstance() == student2);
	}
}
