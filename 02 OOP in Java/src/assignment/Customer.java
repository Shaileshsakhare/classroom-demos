package assignment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer {

	private int id;
	private String name;
	private Date bdate;
	private String city;
   
	
	
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int id, String name, String bdate, String city) {
		this.id = id;
		this.name = name;
		this.bdate = stringToDate(bdate);
		this.city = city;
		System.out.println(bdate);
	}

	public static void main(String[] args) {
		Customer c1 = new Customer(1, "shail", "1994-09-12", "beed");
		c1.setBdate("2000-11-15");
		System.out.println(c1);
	}

	private Date stringToDate(String input) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			sdf.parse(input);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Date getBdate() {
		return bdate;
	}

	public void setBdate(String bdate) {
		this.bdate = stringToDate(bdate);
		System.out.println(bdate);
	}

}
