package com.kh.practice.leap.view;

import java.util.Calendar;
import java.util.Date;

import com.kh.practice.leap.controller.LeapControll;

public class LeapView {

	public LeapView() {
//		기본생성자로 이 안에 평년인지 윤년인지, 
//		1년 1월 1일부터 지금까지 며칠이 지났는지 모두 출력
		
		LeapControll lc = new LeapControll();
		lc.isLeapYear(2023);
		
		
		System.out.println("2023년은 " + (lc.isLeapYear(2023) == true ? "윤년" : "평년") +"입니다." );
		
		
		
		Calendar c = Calendar.getInstance();
		
		
		System.out.println("총 날짜 수 : " + lc.leapDate(c));
		
		
		
		
	}
	
}
