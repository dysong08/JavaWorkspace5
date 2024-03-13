package com.kh.practice.token.controller;

public class TokenController {

	
	
	
	public TokenController() {
		
	}
	
	
	public String afterToken(String str) {
		// 매개변수로 받아온 str을 StringTokenizer를 이용하여
		// 띄어쓰기를 없애고 없앤 문자열 반환

		
		java.util.StringTokenizer st = new java.util.StringTokenizer(str, " ");
		
		String result = "";
		
		while(st.hasMoreTokens())
			result += st.nextToken();		//Java
			
		//=================================
		
//		String [] arr = str.split(" ");		//	["J", "A", "V", "A", ...]		
//		
//		for(int i = 0; i < arr.length; i++) {
//			result += arr[i];
//		}
		
		return result;
		
		
	}
	
	
	
	
	public String firstCap(String input) {
		// 매개변수로 받아온 input의 첫 번째 글자만 대문자로 바꾼 문자열 반환

		
		String result = "";
		StringBuilder sb = new StringBuilder();
		
//	//1. 반복문 활용	
//		
//		for(int i = 0; i < input.charAt(i); i++) {
//			char ch = (char)(input.charAt(i) - (i == 0 ? 32 : 0));		// 32 == 아스키코드상 j-J의 값.
//			sb.append(ch);
//		}
//		return sb.toString();
		
	
//	//2. 메서드 활용	
		
		//String str = input.substring(0, 0).toUpperCase() + input.substring(1);
		return	input.toUpperCase().charAt(0)+input.substring(1);
		
	}
	
	
	public int findChar(String input, char one) {
		// 매개변수의 문자가 문자열 안에 몇 개가 들어가 있는지 반환

		int count = 0;

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == one) {
				count++;
			}
		}
		return count;
	}
	
	
	
	
	
}
