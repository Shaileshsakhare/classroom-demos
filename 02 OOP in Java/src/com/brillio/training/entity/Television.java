package com.brillio.training.entity;

public class Television extends Product {

	private int size; // in inches
	private String screentype; // TFT, LCD, LED, CRT, PLASMA, Projection

	public Television() {
		// TODO Auto-generated constructor stub
	}

	public Television(int productId, String productName, double unitPrice, int size, String screentype,
			String resolution) {
		super(productId, productName, unitPrice);
		this.size = size;
		this.screentype = screentype;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getScreentype() {
		return screentype;
	}

	public void setScreentype(String screentype) {
		this.screentype = screentype;
	}

	@Override
	public String toString() {
		return super.toString()+"Television [size=" + size + ", screentype=" + screentype + "]";
	}
	
	//This method overrides the inherited print() method
	// from the product class. we can use an @Override
	//to inform the compiler to check if it is really overriding.
	@Override
	public void print() {
//		super.print();
//		super.print();
		System.out.println("Size        : "+size);
		super.print();
		System.out.println("Screentype  : "+screentype);
	}
}
