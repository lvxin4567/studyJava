package com.thread;


/**
 * 创建线程的两种方式
 * 1.通过继承Thread类创建线程
 * 2.通过实现Runnable接口创建线程(更常用)
 */

/**
 *java线程优先级10
 *MAX_PRIORITY 10  最高
 *MAX_PRIORITY 1  最低
 *NORM_PRIORITY 5 默认
 *getPriority()
 *intPriority(int a)
 */

/**
 * 多线程运行问题
 * 1.各个现线程是通过竞争CPU时间而获得运行机会的
 * 2.各个线程什么时候得到CPU 占用多久  是不可预测的
 * 3.一个正在运行的线程在什么地方被暂停是不确定的
 * 
 * synchronized
 * 静态方法  普通方法  代码段
 */

/**
 * 线程间的通信
 * wait()  中断方法的执行  是线程等待
 * notify() 唤醒处于等待的某一个线程  使其结束等待
 * notifyAll() 唤醒所有处于等待的线程 使它们结束等待
 * 
 * 死锁概念:
 * 当A线程在等待B线程 B线程又在等待A线程  就是死锁
 */

//runnable
public class ThreadDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyRunnable myRunnable = new MyRunnable();
		Thread myThread = new Thread(myRunnable);
		myThread.start();
		//test join
		try {
			myThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		MyRunnable myRunnable2 = new MyRunnable();
		Thread myThread2 = new Thread(myRunnable);
		myThread2.start();
			
	}

}

class MyRunnable implements Runnable{
//	int i = 0;//类似于共享资源
	public void run() {
		int i = 0;
		while(i < 10) {
			System.out.println(Thread.currentThread().getName()+"执行了:"+ i++);
			//test sleep
//			try {
//				Thread.currentThread();
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
	
		}
	}
}









