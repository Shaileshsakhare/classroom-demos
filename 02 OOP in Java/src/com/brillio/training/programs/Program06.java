package com.brillio.training.programs;

import java.util.Arrays;

public class Program06 {
	public static void main(String[] args) {
		
		//ar is a reference to an array object
		int [][]ar;
		ar=new int[3][];
		
		ar[0]=new int[5];
		ar[2]=new int[]{3,6};
		
		for (int i = 0; i < ar.length; i++) {
			System.out.println(Arrays.toString(ar[i]));
		}
	}
}
