package com.practice.Chapter10;

public class TypeConversionTest {

	public static void main(String[] args) {

//		byte bNum = 125;
//		int iNum = bNum;
//		
//		System.out.println(iNum);
//		
//		int jNum = 255;
//		byte byNum = (byte) iNum;
//		System.out.println(byNum);
//		
//		
//		double dNum = 3.14;
//		int diNum = (int) dNum;
//		System.out.println(diNum);
		
		double dNum = 1.2;
		float fNum = 0.9F;
		int iNum1 = (int)dNum + (int)fNum;
		int jNum1 = (int)(dNum+fNum);
		
		System.out.println(iNum1);
		System.out.println(jNum1);
		
		int myNum = 10;
		int yourNum = 20;
		
		myNum = myNum += yourNum;
		System.out.println(myNum);
		
	}

}
