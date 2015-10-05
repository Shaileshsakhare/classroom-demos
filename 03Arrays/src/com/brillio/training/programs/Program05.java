package com.brillio.training.programs;

import java.util.Arrays;

public class Program05 {
	
	public static void increment(int[] ar,int by){
		for (int i = 0; i < ar.length; i++) {
			ar[i]+=by;
		}
	}
	
	public static void main(String[] args) {
		// n is reference to an array object
		int[] n={12,449,5965};
		
		// int[] n;
		//n=new int[3];
		
		//n={12,44,556}; //error
		
		n=new int[] {48,586,383};
		n[2]=12;
		n[0]=22;
		n[1]=393;
		
		//n[-1]=33;    //throws ArrayOuOfBoundException()
		//n[3]=39393; //throws ArrayOuOfBoundException()
		
		int index=2;
		System.out.println(n[index]);
		
		// It will give some address System.out.println(n);
		System.out.println(Arrays.toString(n));
		increment(n, 10);
		//System.out.println(n);
		System.out.println(Arrays.toString(n));
	}
}
