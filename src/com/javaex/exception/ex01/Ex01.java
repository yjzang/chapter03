package com.javaex.exception.ex01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

	
		double result;
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		try {
			
			result = 100/num;
			System.out.println(result);
		} catch(ArithmeticException e) {
			System.out.println(e);
		} finally {
			System.out.println("finally 영역");
		}
		
		//try-catch 구문은 잘 안쓴다. 오류가 뭔지 알아내어 if 문으로 잡는 것이 더 좋은 코딩
		sc.close();
	
	}

}
