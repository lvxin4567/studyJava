//package com.thread;
//
//public class ThreadDemo {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		//����  
//		//һ̨���Կ���ͬʱ��������� QQ���� ����  ����Ӱ
//		
//		//�߳�
//		//�߳��ǱȽ��̻�ҪС�����е�λ  һ�����̰�������߳�
//		
//		//����CPU��ôʵ�ֶ����
//		//��ʵ��ͨ����ת һ�������ں̵ܶ�ʱ��ʹ��CPU����ʹ��Ȩ���������߳�  �û��о�����
//		
//		//�̵߳Ĵ���Thread�� λ��java.lang����
//		//1.����һ��Thread�� ����һ��Thread����Ķ���
//		// Thread()
//		// Thread(String name)
//		// Thread(Runnable target);
//		// Thread(Runnable target , String name)
//		//2.����һ��ʵ��Runnable�ӿڵ���Ķ���
//		
//		
//		//�����߳���ϰ
//		System.out.println("���߳�1");
//		MyThread myThread = new MyThread();
//		myThread.start();
//		System.out.println("���߳�2");
//	}
//
//}
//
//class MyThread extends Thread{
//	public void run() {
//		System.out.println("���߳�����...");
//	}
//}
