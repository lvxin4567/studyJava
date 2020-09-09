package com.thread1;

public class DrawAcount implements Runnable {

	Bank bank;
	public  DrawAcount(Bank mybank) {
		bank = mybank;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		bank.drawAcount(100);
	
		
	}

}
