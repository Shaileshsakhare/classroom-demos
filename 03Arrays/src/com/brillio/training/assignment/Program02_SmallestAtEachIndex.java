package com.brillio.training.assignment;

import java.util.Arrays;

public class Program02_SmallestAtEachIndex {
	public static int[] a=new int[] {9,69,40,31,18,69};
	public static int[] b=new int[] {5,75,18,18,14,82};
	public static int count;
	
	public static void main(String[] args) {
		int[] c;
		c=findSmallest(a,b);
	
		System.out.println(Arrays.toString(c));
	}

	private static int[] findSmallest(int[] a, int[] b) {
		if(a.length==0){
			return b;
		}
		else if (b.length==0){
			return a;
		}
		
		if(a.length>b.length){
			count=a.length;
		}
		else if(b.length>a.length){
			count=b.length;
		}
		else {
			count=a.length;
		}
		System.out.println(count);
		int[] temp=new int[count];
		for (int i = 0; i < count; i++) {
			if(a[i]>b[i]){
				temp[i]=b[i];
			}
			else if(b[i]>a[i]){
				temp[i]=a[i];
			}
		}
		return temp;
	}
}
