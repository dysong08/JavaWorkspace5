package com.kh.chap02_string.controller;

import java.util.Arrays;

public class B_StringMethodTset {

	
	// 문자열과 관련된 메서드
	public void method1() {
		
		String str1 = "hello world";	// 0~10번 인덱스까지 있음 / 5번인덱스 공백
		
		
		// 1. 문자열.charAt(int index) : char
		//	문자열에서 전달받은 index의 위치에 있는 문자 하나만 뽑아서 반환(리턴)
			
			char ch = str1.charAt(6);	
			System.out.println(ch);			// w 
		
		
		// 2. 문자열.concat(String str) : String
		//	문자열과 전달된 문자열을 하나로 합쳐서 반환
			
			String str2 = str1.concat("!!!!!!");
			System.out.println(str2);		// hello world!!!!!!  (== str1 + "!!!!!!!";)
			
			
		// 3. 문자열.length() : int
		//	문자열의 길이를 반환
			
			System.out.println("str1의 길이 : " + str1.length());		// 11
			
			
		// 4-1. 문자열.substring(int beginIndex) : String
		// 문자열의 beginIndex위치에서 끝까지 문자열을 추출해서 리턴
			
			System.out.println(str1.substring(6));		// world
			
			
		// 4-2. 문자열.substring(int beginIndex, int endIndex) : String 	
		// 문자열의 beginIndex위치에서 endIndex-1 까지의 문자열을 추출해서 리턴
	
			System.out.println(str1.substring(0, 4));	// hell  (== 0 <= Index범위 < 4)
		
			
		// 5. 문자열.replace(char old, char new) : String
		// 현재 문자열에서 old문자를 new문자로 대체(replace)하고 변환한 문자열 리턴	
			
			String str3 = str1.replace('l', 'a');
			System.out.println(str3);						// heaao worad
/* (==)*/	System.out.println(str1.replace('l', 'b'));		// hebbo worbd
			
		// 6. 문자열.trim() : String
		//	문자열의 앞 뒤 공백을 제거한 문자열 리턴
			
			String str4 = "        J a v a   ";
			System.out.println(str4.trim());			// J a v a
			
			
		// 7-1. 문자열.toUpperCase() : String
		//	문자열을 모두 다 대문자로 변경 후 문자열 리턴(영문자 및 대소문자를 지원하는 언어에 한정)
			
		// 7-2.	문자열.toLowerCase() : String
		//	문자열을 모두 다 소문자로 변경 후 문자열 리턴
			
			System.out.println("upper : " + str1.toUpperCase());	// HELLO WORLD
			System.out.println("lower : " + str1.toLowerCase());	// hello world
			
			
		// 8. 문자열.toCharArray() : char[]
		//	문자열의 각 문자들을 char[]배열에 옮겨 담은 후 해당 배열을 리턴
			
			char[] arr = str1.toCharArray();
			System.out.println(Arrays.toString(arr));			// [h, e, l, l, o,  , w, o, r, l, d]
			
		
		// 9. static valueOfAchar[] data) : String
		//	해당 데이터를 문자열로 반환
			
			System.out.println(String.valueOf(arr));			// hello world
			System.out.println(String.valueOf(15));				// 
			
			
			
			
			
			
	}
	
	
	
	
	
	
	
	
	
	
	
}
