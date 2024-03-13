package com.kh.practice.leap.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class LeapControll {

	public boolean isLeapYear(int year) {
//		연도가 윤년이면 true, 평년이면 false 리턴
//		(윤년: 연도가 4의 배수이면서, 100의 배수가 아니거나 400의 배수가 되는 해)

		Calendar cal1 = Calendar.getInstance();
		boolean result = false;

		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			result = true;
		}

		return result;

	}

	public long leapDate(Calendar c) {
//		1년 1월 1일부터 오늘까지의 총 날 수를 계산
//		1년부터 현재 연도까지 각 연도가 윤년이면 총 날수에 366일을, 
//		평년이면 365일을 더함
//		해당 현재 연도가 윤년이면 2월을 	29일로 평년이면 28일로 더함
//		월의 날짜 수를 더함
//		(31일: 1, 3, 5, 7, 8, 10, 12월/ 30일: 4, 6, 9, 11월)

		Calendar today = c;

		Calendar begin = Calendar.getInstance();
		begin.set(1, 0, 1); // <- (월-1)

		
		
		int total = today.get(Calendar.YEAR) - begin.get(Calendar.YEAR) * 365; // 윤년x
		for (int i = 0; i < today.get(Calendar.YEAR); i += 4) { // (i+=4) 4의 배수이면서
			if (i % 100 != 0 || i % 400 == 0) { // 100의배수가 아니거나 400배수가 되는 해
				total++;
			}
		}

		// 올해날짜수 구하기
		Calendar today2 = Calendar.getInstance();
		today2.set(today.get(Calendar.YEAR), 0, 1);

		long diff = today.getTimeInMillis() - today2.getTimeInMillis();
		diff = diff / 1000 / 60 / 60 / 24;
		total += diff;

		return total;
		

		
		
//	 (==)	
//		total = 0;
//
//		for (int i = 1; i < today.get(Calendar.YEAR); i++) {
//			total += 365;
//			if (isLeapYear(i)) {
//				total += 1;
//			}
//		}
//
//		total += diff;
		
		
		
		
		
		
		
		
		
		
//		Calendar cal1 = Calendar.getInstance();
//		cal1.set(1, 0,1);								// 1년 1월 1일로 셋팅
////		long pest = (cal1.getTimeInMillis() / 1000 / 60 / 60 / 24);
//		long pest = cal1.getTimeInMillis();
//		
//		Calendar now = Calendar.getInstance();
//		now.setTime(today);
//		
//		
//		long c = ( (num1 - pest) / 1000 / 60 / 60 / 24) ;
//		
//		SimpleDateFormat dFormat = new SimpleDateFormat ( "yyyy-MM-dd" );
//		dFormat.format(now.getTime());
//		
//		for(int month = 1; month <= 12; month++) {
//			
//			
//		}
//		if(Calendar.get == )
//		
//		return  c;
//			}

	}
}
