package com.itheima.demo1;

import com.itheima.demo1.entity.Cat;
import com.itheima.demo1.entity.DefaultAnimal;

/**
 * @author GG Bond
 * @date 2020/10/25 14:13
 * @description
 */
public class AnimalTest {

	public static void main(String[] args) {
		DefaultAnimal defaultAnimal = new DefaultAnimal(1, "animal");

		defaultAnimal.eat();

		Cat cat = new Cat();
		cat.setName("tomat");
		cat.eat();

	}
}
