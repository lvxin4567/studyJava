package com.thread;


/**
 * �����̵߳����ַ�ʽ
 * 1.ͨ���̳�Thread�ഴ���߳�
 * 2.ͨ��ʵ��Runnable�ӿڴ����߳�(������)
 */

/**
 *java�߳����ȼ�10
 *MAX_PRIORITY 10  ���
 *MAX_PRIORITY 1  ���
 *NORM_PRIORITY 5 Ĭ��
 *getPriority()
 *intPriority(int a)
 */

/**
 * ���߳���������
 * 1.�������߳���ͨ������CPUʱ���������л����
 * 2.�����߳�ʲôʱ��õ�CPU ռ�ö��  �ǲ���Ԥ���
 * 3.һ���������е��߳���ʲô�ط�����ͣ�ǲ�ȷ����
 * 
 * synchronized
 * ��̬����  ��ͨ����  �����
 */

/**
 * �̼߳��ͨ��
 * wait()  �жϷ�����ִ��  ���̵߳ȴ�
 * notify() ���Ѵ��ڵȴ���ĳһ���߳�  ʹ������ȴ�
 * notifyAll() �������д��ڵȴ����߳� ʹ���ǽ����ȴ�
 * 
 * ��������:
 * ��A�߳��ڵȴ�B�߳� B�߳����ڵȴ�A�߳�  ��������
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
//	int i = 0;//�����ڹ�����Դ
	public void run() {
		int i = 0;
		while(i < 10) {
			System.out.println(Thread.currentThread().getName()+"ִ����:"+ i++);
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









