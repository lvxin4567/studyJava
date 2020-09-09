//package com.thread;
//
//public class ThreadDemo {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		//进程  
//		//一台电脑可以同时开多个任务 QQ音乐 聊天  看电影
//		
//		//线程
//		//线程是比进程还要小的运行单位  一个进程包含多个线程
//		
//		//单核CPU怎么实现多进程
//		//其实是通过轮转 一个进程在很短的时间使用CPU后会把使用权交给其他线程  用户感觉不到
//		
//		//线程的创建Thread类 位于java.lang包下
//		//1.创建一个Thread类 或者一个Thread子类的对象
//		// Thread()
//		// Thread(String name)
//		// Thread(Runnable target);
//		// Thread(Runnable target , String name)
//		//2.创建一个实现Runnable接口的类的对象
//		
//		
//		//创建线程演习
//		System.out.println("主线程1");
//		MyThread myThread = new MyThread();
//		myThread.start();
//		System.out.println("主线程2");
//	}
//
//}
//
//class MyThread extends Thread{
//	public void run() {
//		System.out.println("子线程启动...");
//	}
//}
