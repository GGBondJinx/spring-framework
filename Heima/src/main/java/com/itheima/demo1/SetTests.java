package com.itheima.demo1;

import com.itheima.demo1.entity.Student;

import java.util.HashSet;
import java.util.Set;

/**
 * @author GG Bond
 * @date 2020/10/25 19:09
 * @description
 */
public class SetTests {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		set.add(new Student(1, "a"));
	}
}
