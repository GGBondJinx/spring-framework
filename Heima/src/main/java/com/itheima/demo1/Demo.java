package com.itheima.demo1;

import com.itheima.demo1.entity.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author GG Bond
 * @date 2020/10/24 18:55
 * @description
 */
public class Demo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
		Student student = applicationContext.getBean(Student.class);
		System.out.println(student);
	}
}
