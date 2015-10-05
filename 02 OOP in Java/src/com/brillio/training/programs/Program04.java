package com.brillio.training.programs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program04 {
	public static void main(String[] args) {
		Date dt;
		dt=new Date();
	    dt=stringToDate("1994-03-12");
	    System.out.println(dt);		
	}
	private static Date stringToDate(String input) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			return sdf.parse(input);
		} catch (ParseException e) {
			return null;
		}
	}
}
