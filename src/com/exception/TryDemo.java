package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemo {
	
	public static void main(String[] args) {
		/**
		 * try catch finally
		 * try��ִ�д���� catch���� finally������������ִ��
		 * throw   �׳�����
		 * throws  �����׳����������
		 * */
		
//		int result =  testOne();
//		System.out.println("����֮��Ϊ:"+result);
		
//		try {
//			int result = testTwo();
//			System.out.println("����֮��Ϊ:"+result);
//		} catch (ArithmeticException e) {
//			// TODO: handle exception
//			System.out.println("�����������:");
//			e.printStackTrace();
//		}catch (InputMismatchException e) {
//			// TODO: handle exception
//			System.out.println("�����������:");
//			e.printStackTrace();
//		}catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("������������:");
//			e.printStackTrace();
//		}
		
		
		try {
			testThree();
		} catch (HotelAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
		
		
	}
	
	//��������һ  �Լ��ı����Լ�����
	public static int testOne() {
		//��finallyģ�麬��return��ʱ�� ��ʹtry��catch�е�return��Ч
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.print("�������һ������:");
			int one = scanner.nextInt();
			System.out.print("������ڶ�������:");
			int two = scanner.nextInt();
			return one/two;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print("error:");
			e.printStackTrace();
			return 100;
		}
	}
	
	//����������  ˭���õķ���˭���� Ҳ���Լ������ϲ���
	public static int testTwo() throws ArithmeticException , InputMismatchException {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�������һ������:");
		int one = scanner.nextInt();
		System.out.print("������ڶ�������:");
		int two = scanner.nextInt();
		return one/two;	
	}
	
	public static void testThree() throws HotelAgeException {
		
		System.out.print("��������ס�ߵ�����:");
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		if(age < 18) {
			throw new HotelAgeException("��ǰ�˿����䲻���ϴ���18��");
		}
	
		
	}
	
	

}
