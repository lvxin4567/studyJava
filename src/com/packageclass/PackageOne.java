package com.packageclass;

public class PackageOne {
	/**
	 * java数据类型分为基本数据类型和引用类型 
	 * 基本数据类型没有属性 没有方法  无法对象化交互   通过包装类就是为了解决这个问题 
	 * 包装类都是用final修饰 不支持继承
	 * */
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//装箱  基本数据类型-> 包装类
		//拆箱  包装类->基本数据类型
		
		//装箱
		//1.自动装箱
//		int t1 = 2;
//		Integer t2 = t1;
//		//2.手动装箱
//		Integer t3 = new Integer(t1);
//		
//		//拆箱
//		//1.自动拆箱
//		int t4 = t2;
//		//2.手动拆箱
//		int t5 = t2.intValue();
//		
//		double t6 = t2.doubleValue();
		
		//--------------------基本数据类型的转换=================
		
//		//基本数据类型转换成字符串
//		int t1 = 2;
//		String t2 = Integer.toString(t1);
//		
//		//字符串转换成基本数据类型
//		//1.包装类的parse
//		int t3 = Integer.parseInt(t2);
//		//2.包装类的valueOf
//		int t4 = Integer.valueOf(t2);
		
		//====================练习题======================
		
		Integer oneInteger = new Integer(100);
		Integer twoInteger = new Integer(100);
		//编译器执行 Interger four = Interger.valueOf(100);
		//如果数值在-128~127之间  会在对象池里去找 如果有  直接取  没有的话会执行new Integer();
		//Double和Float是没有对象池的概念的
		
		
		System.out.println("oneInteger==twoInteger的结果"+ (oneInteger==twoInteger));
		

		


	}

}
