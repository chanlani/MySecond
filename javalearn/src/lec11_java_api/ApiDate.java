package lec11_java_api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ApiDate {
	public static void main(String[] args) throws ParseException {
		// 현재 시간
		// 1. Date 클래스 사용
		Date dateToday = new Date();
		// Date 객체가 생성되는 순간
		// 해당 date 객체 내부에 그때 시간이 세팅된다.
		System.out.println(dateToday);
		
		// 날짜 포멧 설정
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");	// 대소문자 구별 mm을 소문자로 쓰면 분, 대문자는 월
		String strToday = dateFormat.format(dateToday);
		System.out.println(strToday);
		
//		try {
//			Thread.sleep(2000);
//		} catch(InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println(dateToday);
//		Date newDate = new Date();
//		System.out.println(newDate);
		
		// 2. Calendar 클래스 사용
		Calendar calToday = Calendar.getInstance();			//getInstance는 싱글톤일때 사용
		System.out.println(calToday);
		System.out.println(calToday.getTime());
		
		// 날짜 포멧 적용
		strToday = dateFormat.format(calToday.getTime());
		System.out.println(strToday);
		
		// 3. System 클래스 사용
		// 1970년 1월 1일 부터 현재까지의 경과된 시간을
		// 밀리초 단위로 리턴	
		System.out.println(System.currentTimeMillis());
		strToday = dateFormat.format(System.currentTimeMillis());
		System.out.println(strToday);
		
		// .format() 안에 long타입 정수를 입력하면
		// 1970년 1월 1일 기준으로 해당 millSec가 지난 날짜로 인식
		strToday = dateFormat.format(1647493963587l);	// 숫자 뒤에 l을 붙이면 롱타입이 됨.
		System.out.println(strToday);
		
		System.out.println("\n===========================\n");
		
		// 다양한 날짜 타입 만들기
		// ApiQuestion 에서 함.
		
		System.out.println("\n===================================\n");
		
		// 날짜(타입) <-> 문자열(타입)바꾸기
		String strTomorrow = "2020-03-18 14:23:22";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		// .parse 문자열을 Date 타입으로 변환
		// 해당 문자열 날짜로 세팅된 Date 객체 생성
		Date dateTomorrow = sdf.parse(strTomorrow);
		System.out.println(dateTomorrow);
		
		String strTime = "11:20:33";
		sdf = new SimpleDateFormat("HH:mm:ss");
		Date dateTime = sdf.parse(strTime);
		// 문자열에 포함되어 있지 않은 연,월, 일은 
		// 기본값인 1970년 1월 1일로 되어있다.
		System.out.println(dateTime);
		
		// 문자열에 포함되어있지 않은 시,분,초,밀리초는
		// 기본값은 0으로 되어있다.
		String strYear = "2022.03.17";
		sdf = new SimpleDateFormat("yyyy.MM.dd");
		Date dateYear = sdf.parse(strYear);
		System.out.println(dateYear);
	
		System.out.println("\n==============================\n");
		
		// 날짜 세팅하기
		sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		// 월(month)의 경우 1월이 0, 2월이 1, ... 으로 되어있다. 3월을 출력하려면 2로 씀.
		cal.set(2021, 2, 14, 12, 30, 21);
		String printCal = sdf.format(cal.getTime());
		System.out.println(printCal);
		
		// Date 타입을 Calendar 로 변환
		Date temp = new Date();
		cal.setTime(temp);
		System.out.println(sdf.format(cal.getTime()));
		
		System.out.println("\n========================\n");
		
		// 날짜 연산
		long diffMillTime = dateTime.getTime() - dateYear.getTime();
		System.out.println(diffMillTime);
		
		long diffSec = diffMillTime/ 1000;
		System.out.println(diffSec);
		
		long diffMin = diffSec /60;
		System.out.println(diffMin);
		
		long diffHour = diffMin/ 60;
		System.out.println(diffHour);
		
		long diffDay = diffHour/ 24;
		System.out.println(diffDay);
		
		long diffYear = diffDay/ 365;
		System.out.println(diffYear);
		
		long diff = diffMillTime / (1000 * 60 * 60 *24);
		System.out.println(diff);
		
		// Calendar 사용
		// 한 날짜를 기준으로 날짜를 더하거나 뺄때 유용
		
		// Calendar 현재 날짜 + 시간으로 초기화
		cal.setTime(new Date());
		System.out.println(sdf.format(cal.getTime()));
		
		// 3일 뒤
		cal.add(Calendar.DATE, 3);
		System.out.println(sdf.format(cal.getTime()));
		
		// 11달 뒤
		cal.add(Calendar.MONTH, 11);
		System.out.println(sdf.format(cal.getTime()));
		
		// 7일 전
		cal.add(Calendar.DATE, -7);
		System.out.println(cal.getTime());
		
		// Calendar를 Date로 변환
		// 밀리초인 calendar를 Date타입으로 형변환
		Date dateCal = cal.getTime();
		System.out.println(sdf.format(dateCal));
		
		System.out.println("\n==========================\n");
		
		// Calendar의 getInstance()는 싱글톤이 아니라
		// 새로운 Calendar 객체를 생성하는것. ㅎㄷㄷ
		Calendar calTest = Calendar.getInstance();
		// new Date() 처럼 실행될 당시의 시간이 세팅된 객체가 생성됩니다.
		System.out.println(sdf.format(calTest.getTime()));
		
		calTest.add(Calendar.DATE, 1);
//		try {
//			Thread.sleep(2000);			// 2초 느리게 실행되게 하는거.
//		}catch(InterruptedException e) {
//			e.printStackTrace();
//		}
		
		// 자동생성되는 TODO주석 없애기
		// 요약: Window - Preferences - Java - Code Style
		// - Code Templates - Code - Method body에서 edit 후 주석 제거 후 적용
		
		System.out.println(sdf.format(calTest.getTime()));
		Calendar calTest2 = Calendar.getInstance();
		System.out.println(sdf.format(calTest2.getTime()));
		System.out.println(calTest2.hashCode());
		System.out.println(calTest.hashCode());
		
		System.out.println("\n========================\n");
		
		// 달력 만들기
		int year = 2022;
		int month = 4;
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month-1,1); 		// 0부터 시작해서 -1을 넣어야 4월이 나옴.
		System.out.println(sdf.format(calendar.getTime()));
		
		// 해당 달의 마지막 일(DATE)를 리턴합니다.
		int lastDay= calendar.getActualMaximum(calendar.DAY_OF_MONTH);
		System.out.println(lastDay);
		// 해당 달의 시작 요일(1:일요일, 2:월요일, ...7:토요일)
		int startDay = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println(startDay); 		// 6은 금요일을 의미. 4월 1일은 금요일을 나타냄.
		
		System.out.println(year+"년 "+ month+"월 달력");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		int currentDay = 1;
		
		for(int i = 1; i<= 42; i++) {	// 달력 전체 칸이 42칸이라.
			if(i >= startDay) {
				System.out.printf("%2d\t",currentDay);	// 숫자를 보기 좋게 쓰게 print뒤에 f넣고 포멧형식으로 "%2\t"(2자리 정수)를 넣음.
				currentDay += 1;
				if(currentDay > lastDay) {
					break;
				}
			}else {
				System.out.print("\t");
			}
			if(i % 7 == 0) {
				System.out.println();
			}
			
		}
		
		
		
		
		
		
		
		
	}
	
}
