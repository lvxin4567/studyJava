package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemo {
	
	public static void main(String[] args) {
		/**
		 * try catch finally
		 * try是执行代码段 catch捕获 finally不管怎样都会执行
		 * throw   抛出错误
		 * throws  声明抛出错误的类型
		 * */
		
//		int result =  testOne();
//		System.out.println("两数之商为:"+result);
		
//		try {
//			int result = testTwo();
//			System.out.println("两数之商为:"+result);
//		} catch (ArithmeticException e) {
//			// TODO: handle exception
//			System.out.println("捕获到运算错误:");
//			e.printStackTrace();
//		}catch (InputMismatchException e) {
//			// TODO: handle exception
//			System.out.println("捕获到输入错误:");
//			e.printStackTrace();
//		}catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("捕获到其他错误:");
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
	
	//错误处理方案一  自己的报错自己处理
	public static int testOne() {
		//当finally模块含有return的时候 会使try和catch中的return无效
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.print("请输入第一个整数:");
			int one = scanner.nextInt();
			System.out.print("请输入第二个整数:");
			int two = scanner.nextInt();
			return one/two;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print("error:");
			e.printStackTrace();
			return 100;
		}
	}
	
	//错误处理方案二  谁调用的方法谁处理 也可以继续向上层抛
	public static int testTwo() throws ArithmeticException , InputMismatchException {
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入第一个整数:");
		int one = scanner.nextInt();
		System.out.print("请输入第二个整数:");
		int two = scanner.nextInt();
		return one/two;	
	}
	
	public static void testThree() throws HotelAgeException {
		
		System.out.print("请输入入住者的年龄:");
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		if(age < 18) {
			throw new HotelAgeException("当前顾客年龄不符合大于18岁");
		}
	
		
	}
	
	

}
