package com.javaex.api.ex02;

public class StringApp02 {




	public static void main(String[] args) {
		
		
		String a = new String("   abcd");
		String b = new String(",efg ");
		
		
		a= a.concat(b);
		System.out.println(a);
		
		
		a = a.trim();
		System.out.println("---" + a + "-----");
		
		a = a.replace("ab", "12");
		System.out.println(a);
		
		String[] s = a.split(",");
		for(int i=0; i<s.length; i++) {
			System.out.println(s[i]);
		}
			
		String str = "Hello java!";
		
		String r01 = str.substring(3);
		System.out.println(r01);
		
		Integer n=new Integer(1);
		int k= 1;
		
		System.out.println(n.hashCode());
		
		
		
		
		
				
	}
		

}
