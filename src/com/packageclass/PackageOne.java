package com.packageclass;

public class PackageOne {
	/**
	 * java�������ͷ�Ϊ�����������ͺ��������� 
	 * ������������û������ û�з���  �޷����󻯽���   ͨ����װ�����Ϊ�˽��������� 
	 * ��װ�඼����final���� ��֧�ּ̳�
	 * */
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//װ��  ������������-> ��װ��
		//����  ��װ��->������������
		
		//װ��
		//1.�Զ�װ��
//		int t1 = 2;
//		Integer t2 = t1;
//		//2.�ֶ�װ��
//		Integer t3 = new Integer(t1);
//		
//		//����
//		//1.�Զ�����
//		int t4 = t2;
//		//2.�ֶ�����
//		int t5 = t2.intValue();
//		
//		double t6 = t2.doubleValue();
		
		//--------------------�����������͵�ת��=================
		
//		//������������ת�����ַ���
//		int t1 = 2;
//		String t2 = Integer.toString(t1);
//		
//		//�ַ���ת���ɻ�����������
//		//1.��װ���parse
//		int t3 = Integer.parseInt(t2);
//		//2.��װ���valueOf
//		int t4 = Integer.valueOf(t2);
		
		//====================��ϰ��======================
		
		Integer oneInteger = new Integer(100);
		Integer twoInteger = new Integer(100);
		//������ִ�� Interger four = Interger.valueOf(100);
		//�����ֵ��-128~127֮��  ���ڶ������ȥ�� �����  ֱ��ȡ  û�еĻ���ִ��new Integer();
		//Double��Float��û�ж���صĸ����
		
		
		System.out.println("oneInteger==twoInteger�Ľ��"+ (oneInteger==twoInteger));
		

		


	}

}
