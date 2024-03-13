package com.kh.practice.charCheck.controller;

import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterController {

	
	public CharacterController() {
		
	}
	
	
	public int countAlpha (String s) throws CharCheckException {
		// 매개변수로 받은 값을 부모 생성자로 넘기는 생성자
		
		// 매개변수로 들어온 값에 있는 영문자를 세어 반환
		// 문자열에 공백이 있다면 CharCheckException발생, 에러 메시지는 출력 값 참고
		
		
		// => 문자열의 길이만큼 반복, 각 문자가 영문자인지 아닌지 체크
		//	  영문자라면 갯수를 카운트애서 총 객수 반환
		
		
		s = s.toUpperCase();
		int count = 0;
		
		if(s.indexOf(" ") != -1) {		// 찾는 값이 없을경우 -1을 반환함
			throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");
		}
		
		for(int i = 0; i < s.length(); i++ ) {
			
			char ch = s.charAt(i);
			if(ch >= 'A' && ch <= 'Z' ) {
				count++;
			}
		} return count;
		
		
		
		
		
		//==========================	
	
//		int count = 0;
//		s = s.toUpperCase();
//		
//		if(s.indexOf(" ") < -1) {
//			throw new CharCheckException( "체크할 문자열 안에 공백이 포함되어 있습니다.");
//		}
//		
//		
//		for(int i = 0; i < s.length(); i++ ) {
//			
//			char currentVal = s.charAt(i);
//			if(currentVal >= 'A' && currentVal <= 'Z') {  // 영문자라면
//				count++;
//			}
//		}
//		
//		return count;
		
		
		
	}
	
	
	
}
