package com.thread1;

public class Bank {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
	
	private int bankId = 0;
	private int acount = 0;
	
	
	public Bank(int i, int j) {
		// TODO Auto-generated constructor stub
		this.bankId = i;
		this.acount = j;
	}

	//sleep wait
	public void saveAcount(int acount) {
		int cur = getAcount();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setAcount(cur+acount);
		System.out.println("¥Ê«Æ∫Û:"+this.acount);
	}
	
	public void drawAcount(int acount) {
		int cur = getAcount();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setAcount(cur-acount);
		System.out.println("»°«Æ∫Û:"+this.acount);
	}
	
	public void setAcount(int acount) {
		this.acount = acount;
	}
	public int getAcount() {
		return this.acount;
	}

}
