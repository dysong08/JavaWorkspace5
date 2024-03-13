package com.kh.chap04_date.run;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Run {

	public static void main(String[] args) {
		
	
	
//	java.util.Date 클래스
//	- 날짜와 시간에 대한 정보를 담을 수 있는 클래스
//	- 자바 개발 초창기에 급하게 만들어져서 완성도가 높지 않은 클래스(다국적사용에 부적합)
//	
//	기본생성자를 통해 Date 객체 생성 -> 현재 시간 및 날짜를 가져옴
	
		Date today = new Date();
		System.out.println("기본생성자 : " + today);
		
		
		
		
//	내가 원하는 날짜(2023년 10월 19일)로 시간 셋팅하기
//	
//	방법1. 매개변수 있는 Date클래스 생성자를 통해 변경 (권장X)
	
	Date date1 = new Date(2023 - 1900 , 9, 19);		// Y:셋팅하고자 하는 년도-1900 / M: 셋팅하고자 하는 월 -1
	System.out.println("매개변수 있는 생성자를 통한 Date : " + date1);
	
	
	//java.text.SimpleDateFormat => 내 입맛대로 포맷을 지정한 문자열을 받고자 할때 사용
			
//		1. 형식(포멧)을 지정하면서 SimpleDateFormat 객체 생성
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy년 MM월 dd일" + " hh시 mm분 ss초");
		
//		2. sdf객체에서 제공하는 format메서드 호출하면서 매개변수로 Date객체를 전달한다.
//			포맷에 저장한 형식대로 String 문자열을 반환
//			sdf.format(Date 참조변수) : String
		String formatDate = sdf.format(today);
			System.out.println(formatDate);
			
		
		System.out.println("==================");
		
		
//	 Calendar : 날짜와 시간에 관한 데이터를 손쉽게 처리할 수 있는 추상클래스
//		(국가마다 사용하는 달력체계가 다를 수 있으므로 나라마다 다른 달력객체를 반환해주기 위해 추상클래스로 선언됨)
		
		
		// 현재 날짜 및 시각 정보 조회
		Calendar cal1 = Calendar.getInstance();		// <- 다국적 사용가능.
		
		// 현재 로컬 컴퓨터상의 지역정보를 바탕으로 해당지역의 시간정보를 가져옴
		// 그 달력정보가 그레고리력이면 그레고리달력 객체를 반환함
		
		Calendar cal2 = new GregorianCalendar();	// <- 한국에서만 사용가능.
		// 로컬컴퓨터상의 지역정보에 해당하는 달력
				
		// 조회
		System.out.println(cal1.get(Calendar.YEAR));
		System.out.println(cal1.get(Calendar.MONTH)+1);		// month는 기본으로 0월부터 시작함
		System.out.println(cal1.get(Calendar.DATE));
		// 그외 년 월 일 시 분 초  전부 반환 가능함.
		
		
		
		
		
		// 특정일 특정시간을 Calendar 객체로 생성하기
		Calendar cal3 = Calendar.getInstance();
		cal3.set(2024,0,1,0,0,0);		// 2024년 1월 1일 0시 0분 0초
		
		Calendar cal4 = new GregorianCalendar(2024,1,1,0,0,0);	// 2024년 2월 1일 0시 0분 0초
		
			
	
		// 날짜 차이 계산
		Calendar now = Calendar.getInstance();
		
		// 밀리초 단위로 변환해서 시간의 차이를 구하기
		// 밀리초 == 1000 mills == 1초
		// mills / 1000 / 60 / 60 / 24 == 
		
		// 1970년 1월 1일 자정 기준으로 현재시간까지를 밀리초로 변환함
		long num1 = now.getTimeInMillis();		// 1970년 1월 1일 ~ 2023년 10월 19일까지 흐른 시간을 밀리초로 반환
		long num2 = cal3.getTimeInMillis();		// 1970년 1월 1일 ~ 2024년 1월 1일까지 흐른 시간을 밀리초로 반환
		
		System.out.println("새해까지 D-" + (num2 - num1) / 1000 / 60 / 60 / 24 );
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
