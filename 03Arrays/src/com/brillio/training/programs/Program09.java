package com.brillio.training.programs;

import com.brillio.training.entity.Person;

public class Program09 {
	public static void main(String[] args) {
		//persons is not reference to a person object
		//but it is a ref to an array of person objects
		
		Person[] persons;
		
		persons=new Person[3];
		persons[0]=new Person(1,"shailesh","Bangalore");
		persons[1]=new Person(2,"shai","Beed");
		persons[2]=new Person(3,"shail","maharashtra");
	  
		for (Person p1 : persons) {
			
		}
	}
}
