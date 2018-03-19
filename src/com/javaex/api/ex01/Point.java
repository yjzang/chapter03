package com.javaex.api.ex01;

public class Point {

	
	private int x;
	private int y;
	
	public Point( int x, int y) {
		
		this.x = x;
		this.y = y;
		
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	

	// 이것은 오버라이드가 아니다. (Object p)로 받아 주어야 부모와 연동되어 오버라이드 개념이다.
	public boolean equals(Point p) {
		
		if(x==p.x && y==p.y ) {
			return true;
		}else {
			return false;
		}

		// 
		
		
	}
	
	
}
