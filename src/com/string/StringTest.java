package com.string;

import java.io.UnsupportedEncodingException;

public class StringTest {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		
		//============创建String对象===============================
//		//1.
//		String s1 = "imooc";
//		//2.
//		String s2 = new String();
//		//3.
//		String s3 = new String("imooc");
		//===============================================
		
		//将字符串转换为byte数组  
		String str = new String("JAVA 编程 基础");
		
		byte[] arrs = str.getBytes();
		for(int i = 0 ; i < arrs.length ; i++) {
			System.out.println(arrs[i]+"");
		}
		
		//内存空间  栈：类的引用      堆：new 字符串常量              常量池:字符串常量
		
		//将byte数组转化为字符串
		String str1 = new String(arrs);
		System.out.println(str1);
		
		//String对象的常用方法
		
		//==和equals方法区别
		
		//String不可变性  一旦被创建  则不可修改  是不可变的
		//所谓的修改其实是创建了新的对象   所指向的内存空间不变


	}
	
	
	public void testStringBuilder() {
		//StringBuffer  StringBuilder
		//二者基本相似  StringBuffer是线程安全的  StringBuilder则没有
		
	}

}
