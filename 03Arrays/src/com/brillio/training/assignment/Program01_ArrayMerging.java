package com.brillio.training.assignment;

import java.util.Arrays;

public class Program01_ArrayMerging {
	static int[] a = { 10, 30, 49, 55, 56 };
	static int[] b = new int[] { 12, 44, 27 };
	static int count,merge_count;

	private static int[] merge(int[] a, int[] b) {
		int[] d = new int[count];
		
		for (int i = 0; i < a.length; i++) {
			d[i]=a[i];
		}
		
		int index = a.length;
		for (int i = 0; i < b.length; i++) {
			d[index] = b[i];	
			index++;
		}
		
		for (int i = 0; i < d.length; i++) {
			if(d[i]%2!=0){
				merge_count++;
			}
		}
		int[] temp=new int[merge_count];
		for (int i = 0,j=0; i < d.length; i++) {
			if(d[i]%2!=0){
				temp[j]=d[i];
				j++;
			}
		}
		return temp;
	}

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
		count=a.length+b.length;
		System.out.println(count+"C Array Size");
		int[] c; 
		c=merge(a,b);
		System.out.println(Arrays.toString(c));

	}

}


