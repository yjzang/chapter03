package com.javaex.exception.ex02;

import java.io.IOException;

public class ThrowExepApp {

	public static void main(String[] args) {

		
		ThrowExep exep = new ThrowExep();
		
		try {
			exep.executeExcept();
		} catch (IOException e) {
			// TODO Auto-generated catch block
				System.out.println(e);
		}
		
		
				
	}

}
