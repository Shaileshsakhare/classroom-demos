package com.brillio.training.programs;

public class Program08 {
	public static void main(String[] args) {
		//array of 4 string
		String[] names={"Jones","Shailesh","Anit","Mirza"};
		
		//enhanced for loop (for-each loop)
		//introduced in Java 1.5
		for(String name:names){
			System.out.println(name);
		}
		
		System.out.println("Name at index 1 is "+names[1]);
	}
}
