package com.brillio.training.programs;

import com.brillio.training.entity.Person;

public class Program10 {
	public static void main(String[] args) {
		Person p1=new Person(7733,"Shailesh Sakhare","Beed");
		
		//array of objects
		Person[] persons={
				new Person(),
				new Person(22,"ss","rr"),
				new Person(33,"55","gf"),
				p1
		};
		p1.setId(5);
		persons[3].setId(9);
		System.out.println(p1);
	}
}
