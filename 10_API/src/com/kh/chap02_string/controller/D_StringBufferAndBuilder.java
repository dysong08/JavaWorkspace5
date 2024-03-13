package com.kh.chap02_string.controller;

public class D_StringBufferAndBuilder {

//	String 불변클래스	-> imutable
//	StringBuffer 와 StringBuilder 클래스 ? -> mutable클래스
//
//	문자열 연산이 빈번하게 일어나는 프로세스 or 알고리즘에서 발생하는 메모리 이슈를 해결하기 위해 나온 클래스
//	
//	기본적으로 두 개의 클래스는 동일한 메서드를 지니며, 차이점은 동기화 여부
//	
//	StringBuffer는 멀티스레드환경에서 유용하며 ex)채팅, 하나의 객체를 공유, 동기화되어 있음(느림)
//	StringBuilder는 싱글스레드환경에서 유용하다
	
	
	
	public void method1() {
		
		String str = "hello";		// 저장공간 그대로 차지하고 있음
		str += "world";				// helloworld
		
		StringBuffer sb = new StringBuffer("hello");
		sb.append("+world,");
		
		System.out.println(sb);			// hello+world,

		
		
		StringBuilder sb2 = new StringBuilder("hello");
		sb2.append("++world");	
		
		System.out.println(sb2);		// hello++world
		
		
		System.out.println("sb의 길이는? : " + sb.length());			// 12
		
		System.out.println("o의 위치는? " + sb.indexOf("o"));				// 4 (번 인덱스)
		System.out.println("o의 마지막 위치는? " + sb.lastIndexOf("o"));		// 7 (번 인덱스)
		
		
		// ex) Test.ABC.txt 
		String filename = "Test.ABC.txt";
		String filename2 = filename.substring(0, filename.lastIndexOf("."));
		System.out.println("Test.ABC.txt에서 확장자를 제외한 파일명? : " + filename2);
		
		
		// 인덱스위치의 문자를 없애는 메서드
		// 마지막위치의 문자를 없애는 메서드(마지막위치 -> 문자열의 길이 -1)
		
		sb.deleteCharAt(sb.length()-1);		// hello+world, 에서 ',' 삭제
		System.out.println(sb);				// hello+world

		
		
		// 내가 원하는 위치의 인덱스부터 내가 정한 마지막 인덱스까지 삭제
		// 시작인덱스 <= 인덱스범위 < 종료인덱스
		
		sb.delete(2, sb.length()-1);
		System.out.println("sb : " + sb);
		
		
		System.out.println(sb.delete(3, sb.length()-1));
		System.out.println("sb : " + sb);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
