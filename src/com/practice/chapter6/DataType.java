package com.practice.chapter6;

public class DataType {

	public static void main(String[] args) {
		// 자료형 (data type)
		// 1. 기본자료형 : byte,short,int,long / char / foloat,double / boolean
		// 크기가 저해져 있음. 
		// 정수의 리터럴은 4byte(int)를 기본으로 잡음. long을 사용할 땐 L을 붙여줘야 함.
		// 실수의 리털은 4byte(dobule)을 기본으로 잡음. float을 사용할 땐 F를 붙여줘야 함.
		
		
		// [정수 자료형]
		byte bNum = -128;
		bNum = 127;
		
		//int num = 1234567890123;
		long num = 1234567890123L;
		
		System.out.println(bNum);
		System.out.println(num);
		
		// [실수 자료형]
		double dNum = 3.14;
		float fNum = 3.14F;
		
		System.out.println(dNum);
		System.out.println(fNum);
		
		// [문자형]
		char ch = 'A'; //2byte, 양수만 쓸 수 있음.
		System.out.println(ch);
		System.out.println((int)ch);
		
		char ch2 = 66;
		System.out.println(ch2);
		System.out.println((char)ch2);
		
		int ch3 = 67;
		System.out.println((char)ch3);
		
		char han = '한';
		char ch4 = '\uD55C';
		
		System.out.println(han);
		System.out.println(ch4);
		
		// 2. 참조자료형
	}
}
