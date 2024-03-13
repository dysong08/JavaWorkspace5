package com.kh.chap02_string.controller;

//	String 불변클래스(값이 변하지 않는 클래스)
//	값을 수정하는 순간 기존의 값이 담겨있는 공간에서 수정되지 않음.
public class A_StringPoolTest {

	
	//1. new 생성자를 통한 문자열 담기 
	public void method1() {
		
		
		String str3 = new String("hello2");
		String str4 = new String("hello2");
		
		System.out.println(str3 == str4);		// false (주소값을 비교)
		System.out.println(str3);				// hello2
		System.out.println(str3.toString());	// hello2
		
		// String 클래스의 toString() 메서드의 경우 실제 담겨있는 문자열을 반환하도록 오버라이딩 되어있음.
		
		System.out.println(str3.equals(str4));	// true
		// String 클래스의 equals() 메서드의 경우 주소값 비교가 아닌 문자열 비교를 하도록 오버라이딩 되어있음.
		
		
		System.out.println(str3.hashCode());	// -1220935264
		System.out.println(str4.hashCode());	// -1220935264
		// String 클래스의 hashCode() 메서드의 경우 실제 담긴 문자열 기반으로 10진수주소값 반환하도록 오버라이딩 되어있음.
		
		
		// 주소값을 알고싶을때 사용하는 메서드 : System.identityHashCode()
		System.out.println(System.identityHashCode(str3));	// 1982791261
		System.out.println(System.identityHashCode(str4));	// 1562557367
			
		
	}
	
	
	
	//2. 문자열을 리터럴로 생성
	public void method2() {
	
	// new 연산자를 통해 생성된 값은 heap 메모리에 올라감
	String str = new String("hello");
	
	// 리터럴값은 상수풀(String pool)에 올라감
	String str1 = "hello";
	String str2 = "hello";
	
	// String pool : 동일한 문자열 존재 불가.
	System.out.println(str1 == str2); 		// ture  -> 상수풀로 인해 동일한 주소값을 공유함.
	System.out.println(str == str2); 		// false -> 
	
	System.out.println(str1.hashCode());	// 99162322
	System.out.println(str2.hashCode());	// 99162322
	
	
	System.out.println(System.identityHashCode(str1));	// 1392425346 
	System.out.println(System.identityHashCode(str2));	// 1392425346
	
	
	
	}
	
	public void method3() {
		
		
		String str = "hello";
		System.out.println(System.identityHashCode(str));  	// 1404928347
		
		
		str = "goodbye";
		System.out.println(System.identityHashCode(str));	// 1562557367
		
		str += "abc"; 	// goodbyeabc				
		System.out.println(System.identityHashCode(str));	// 1101288798
		
		
		String str2 = "hello";
		System.out.println(System.identityHashCode(str2));	// 1404928347
		
		
		
	}
	
	
//	*String 자료형의 특징
//	기존의 상수풀의 연결이 끊긴 문자열들은 가비지콜렉터가 알아서 정리해줌
//	불변이라고 해서 수정이 아예 안되는게 아니라
//	기존의 저장공간(원래있던 주소값)에서 수정되는 개념이 아니라
//	매번 새로운 주소값을 참조하게 됨.
	
	
	
	
	
	
	
	
}
