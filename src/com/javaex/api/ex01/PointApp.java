package com.javaex.api.ex01;

public class PointApp {

	public static void main(String[] args) {

		
		Point a = new Point(4,3);
		Point b = new Point(4,3);
		Point c = a;
		
		System.out.println(a==b);  //머리로 생각하면 헷갈림. 인스턴스 그려보면 이해가 됨. 주소값은 서로 다르다.
		System.out.println(a==c);
		
		System.out.println(a.equals(b));
		
		String d;
		
		System.out.println(d.e);
		
		
/*		System.out.println(a.hashCode());
		System.out.println(a.getClass());
		System.out.println(a.getClass().getName());
		System.out.println(a.toString());
		System.out.println(a);   //toString 출력과 같다.
		System.out.println(a.getClass().getSimpleName());
*/
		
		System.out.println(a.hashCode());	
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
	}

}
