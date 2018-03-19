package com.javaex.exception.ex02;

import java.io.IOException;

public class ThrowExep {
	
	
		public void executeExcept() throws IOException {
			
			
				System.out.println("강제 예외 발생");
				throw new IOException() ;
				
			
		
		}
		
}
