package com.kh.chap01_math.run;


// import java.lang.*;
// 생략가능. 보이진 않지만 항상 자동으로 모든 클래스에는 java.lang패키지내부의 클래스가 import되어 있음.

public class MathRun {

	
	
	public static void main(String[] args) {
		// Math 클래스 관련 기능(수학과 관련된 기능을 제공)
		
		//파이 => Math클래스내의 상수필드 3.1415...
		System.out.println("파이 : " + Math.PI);
				
		
		// 메서드명(매개변수) : 반환형
		
		
		double num1 = 4.349;
		
		// 올림메서드 => Math.ceil(double) : double
		System.out.println("올림 : " + Math.ceil(num1));		// 5.0
		
		
		// 반올림 => Math.round(double) : long
		System.out.println("반올림 : " + Math.round(num1)); 	// 4
		
		// 버림 => Math.floor(double) : double
		System.out.println("버림 : " + Math.floor(num1)); 	// 4.0
		
		// 가장 가까운 정수값을 알아낸 후 실수형 반환 : rint
		System.out.println("가장 가까운 정수값 : " + Math.rint(num1));	// 4.0
		
		// 절대값 => Math.abs(int/double/long/float) : 매개변수의 자료형
		int num2 = -10;
		System.out.println("절대값 : " + Math.abs(num2));			// 10
		
		// 최소값 => Math.min(int, int) : int
		System.out.println("최소값 : " + Math.min(10.5, 100));
		
		// 최대값 => Math.max(int, int) : int
		System.out.println("최대값 : " + Math.max(100, 11.5));
		
		// 제곱근(루트) => Math.sqrt(double) : double
		System.out.println("9의 제곱근 : " + Math.sqrt(9));		// 3.0
		
		// 제곱 => Math.pow(double, double) : double
		System.out.println("2의 10제곱 : " + Math.pow(2, 10));	// 1024.0	
		
		
		
//		java.lang.Math 클래스의 특징
//		- 모든 필드 : 상수필드(PI, E)
//		- 모든 메서드 : static메서드
//		
//		
//		모든게 다 static이기 때문에 멤버에 접근시 Math.필드 or Math.메서드명 으로 다 접근할 수 있다.
//		=>객체를 생성할 필요가 없다
//		
//		따라서, Math클래스의 생성자는 애초에 객체생성이 불가능하도록 private접근제한자를 가지고 있음.
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
