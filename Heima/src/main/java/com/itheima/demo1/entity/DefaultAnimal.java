package com.itheima.demo1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author GG Bond
 * @date 2020/10/25 14:11
 * @description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DefaultAnimal implements Animal {

	private Integer id;

	private String name;

	@Override
	public void eat() {
		System.out.println(name + " eat...");
	}
}
