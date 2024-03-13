package com.kh.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CheckedException {

	
//	B_CheckedException은 반드시 예외처리를 해줘야 하는 예외들
//	즉, 예측이 불가능한 곳에서 예외가 발생하기 때문에 미리 예외처리 구문을 작성해야 함
//	=> 주로 외부매체와 입출력시 발생.
	
	
	public void method1() {
		
		
		try {
			method2();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	} 
	
	
	public void method2() throws IOException {
		
		// Scanner와 같이 키보드로 값을 입력받을 수 있는 객체
		// BufferedReader -> 문자열 입력만 가능
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
		
		System.out.print("아무 문자열이나 입력해주세요 : ");
		
		
		// 1. try ~ catch문으로 예외 처리하기.
		
		try {
			// 아래 메서드 호출시 IOException 발생할 수도 있음을 컴파일 에러로 알려준다.
			String str = br.readLine();  // 문자열값 얻어오는 메서드
			
		} catch (IOException e) {	// 
			e.printStackTrace();
		}	
		
		
		// 2. throws : 지금 현재 메서드에서 예외를 처리하지 않고, 현제 메서드를 호출한 곳으로 떠넘기는 방법
		
		String str = br.readLine();
		
		System.out.println("문자열의 길이 : " + str.length());
		
		
	}
	
	
//						예외 발생 시점 						예외 처리
//RuntimeException	프로그램 실행하는 도중 발생				필수아님-> unchecked Exception
//IOException			그 외 -> 컴파일 에러					필 수 ->  checked Exception
	
	
	
	
	
	
	
	
	
	
}
