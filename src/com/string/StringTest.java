package com.string;

import java.io.UnsupportedEncodingException;

public class StringTest {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		
		//============����String����===============================
//		//1.
//		String s1 = "imooc";
//		//2.
//		String s2 = new String();
//		//3.
//		String s3 = new String("imooc");
		//===============================================
		
		//���ַ���ת��Ϊbyte����  
		String str = new String("JAVA ��� ����");
		
		byte[] arrs = str.getBytes();
		for(int i = 0 ; i < arrs.length ; i++) {
			System.out.println(arrs[i]+"");
		}
		
		//�ڴ�ռ�  ջ���������      �ѣ�new �ַ�������              ������:�ַ�������
		
		//��byte����ת��Ϊ�ַ���
		String str1 = new String(arrs);
		System.out.println(str1);
		
		//String����ĳ��÷���
		
		//==��equals��������
		
		//String���ɱ���  һ��������  �򲻿��޸�  �ǲ��ɱ��
		//��ν���޸���ʵ�Ǵ������µĶ���   ��ָ����ڴ�ռ䲻��


	}
	
	
	public void testStringBuilder() {
		//StringBuffer  StringBuilder
		//���߻�������  StringBuffer���̰߳�ȫ��  StringBuilder��û��
		
	}

}
