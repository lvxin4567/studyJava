package com.thread1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank bank = new Bank(8888 , 1000);
		
		//为了保证在存款或者取款的时候  不允许其他线程对账户余额进行操作
		//需要将Bank对象进行锁定
		//使用关键字synchronized实现
		
		SaveAcount saveAcount = new SaveAcount(bank);
		DrawAcount drawAcount = new DrawAcount(bank);
		Thread savethread = new Thread(saveAcount);
		Thread drawThread = new Thread(drawAcount);
		savethread.start();
		drawThread.start();
		
		try {
			//让存取款线程先走完
			savethread.join();
			drawThread.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		System.out.print("finally:"+ bank.getAcount());
		

		
		

	}

}
