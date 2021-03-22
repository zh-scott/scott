package cn.com.scott.pojo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable{
	private String name;
	private Integer age;
	private Integer score;
	private transient String password;
	private static String clazz = "1班";
	
	private static final long serialVersionUID = 1522533131333323123L;
	
	//验证反序列化后的单例对象和原单例对象是否一致
	private static class StudentHolder {
		private static final Student student = new Student();
	}
	
	public static synchronized Student getInstance() {
		return StudentHolder.student;
	}
	
	//此方法无需调用，用于约束反序列化时对象规则
	private void readObject(ObjectInputStream ois) throws Exception {
		ois.defaultReadObject();
		if (score < 0 || score > 100) {
			throw new Exception("学生分数只能在0到100之间！");
		}
	}
	
	//反序列化时用此对象替代反序列化新建的对象
	private Object readResolve() {
	    return StudentHolder.student;
	}
	
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score
				+ "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
}
