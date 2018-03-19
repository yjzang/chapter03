package com.javaex.api.ex02;

public class StringApp01 {

	public static void main(String[] args) {

		
		String s1 = "hello";
		String s2 = "hello";
		
		System.out.println(s1==s2);
		
		s1 = "hi";
	
		System.out.println(s1==s2);
		
		/////////////////////////////
		
		String s3 = new String();
		String s4 = new String();
		
		
		System.out.println(s3==s4);
		

		s3 = "hello";
		s4 = "hello";
		
		System.out.println(s3==s4);
		

	}
	

}
