package com.brillio.training.programs;

public class Program12 {

	// to supply command line arguments in eclipse
	// use the menu-> run configurations
	// select the arguments tab
	// pass the value through " program arguments"
	
	//to supply strings with space, use the double quotes
	
	//to supply double quotes as part of the input, escape them
	//for eg:- "5' 10\"" will be accepted as 5' 10

	public static void main(String[] args) {
		System.out.println("There are" + args.length + " coomand line arguments");

		for (int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "] is " + args[i]);
		}
	}
}
