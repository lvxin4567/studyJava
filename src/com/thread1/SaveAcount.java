package com.thread1;

public class SaveAcount implements Runnable {
	Bank bank;
	public SaveAcount(Bank mybank) {
		bank = mybank;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		bank.saveAcount(200);
	}

}
