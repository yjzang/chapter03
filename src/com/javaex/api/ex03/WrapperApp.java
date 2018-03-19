package com.javaex.api.ex03;

public class WrapperApp {

	
		public static void main(String[] args) {
			
			
			Integer i = new Integer(10);
			Short s = new Short((short)3);
			Byte b = new Byte((byte)3);
			
			System.out.println(i.hashCode());
			
			Integer result = new Integer(10) + new Integer(3);
			System.out.println(result);
			System.out.println(b);
			
			
			Integer i01 = 10;
			int r01 = i01;
			System.out.println(i01.hashCode());
			
			//문자열-->정수로
			int r02 = i01.parseInt("1234");
			System.out.println(r02);
			
			
			//정수를 문자열로
			String str = String.valueOf(555);
			System.out.println(str);
			
			String str2 = ""+(666);
			System.out.println(str2);
			
			String s04 = "hi";
			String inputText = "hi";
			if(inputText.equals(s04)) {
				
			if("hi".equals(s04)) {
				
			}
				
			}
		}
}
