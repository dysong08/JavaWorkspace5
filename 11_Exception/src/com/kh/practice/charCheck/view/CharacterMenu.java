package com.kh.practice.charCheck.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.kh.practice.charCheck.controller.CharacterController;
import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterMenu {

	CharacterController cc = new CharacterController();
	
	
	public void menu()  {
		// 사용자에게 받은 값에 있는 영문자 개수 출력

		// 사용자에게 문자열을 입력 받아 
		// CharacterController의 countAlpha()에 매개변수로 넘겨주어 반환 값을 출력함
		// 이 때 countAlpha()메소드를 호출하는 부분부터 try~catch를 이용하여 예외 처리

		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String s = sc.nextLine();

		try {
			System.out.printf("'%s'에 포함된 영문자 개수는 : %d", s, cc.countAlpha(s));
		} catch (CharCheckException e) {
			e.printStackTrace();
		}

	}

	
	
	
	
}
