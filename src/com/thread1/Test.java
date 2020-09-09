package com.thread1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank bank = new Bank(8888 , 1000);
		
		SaveAcount saveAcount = new SaveAcount(bank);
		DrawAcount drawAcount = new DrawAcount(bank);
		Thread savethread = new Thread(saveAcount);
		Thread drawThread = new Thread(drawAcount);
		savethread.start();
		drawThread.start();
		
		try {
			savethread.join();
			drawThread.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		System.out.print("finally:"+ bank.getAcount());
		

		
		

	}

}
