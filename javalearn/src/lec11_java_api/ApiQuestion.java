package lec11_java_api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class ApiQuestion {
	public static void main(String[] args) throws ParseException {
		// 다양한 날짜 포멧 적용
		// 시계방 놀러갔더니 다양한 디지털 시계들이 있군요.
		// 1. 2022/03/17 14:17:20
		// 2. 2022-03-17 오후 02:17:20
		// 3. 2022.03.17 PM 02:17:20
		// 4. 목 오후 02:17:20
		// 5. 목요일 14:17:20
		// 6. Thu PM 02:17:20
		// 이 디지털 시계들을 여러분도 만들으면 좋다.
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		String strDay = sdf.format(date);
		System.out.println("1. "+strDay);
		
		// 2
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd aa hh:mm:ss");
		System.out.println("2. "+sdf2.format(date));
		
		// 3
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy.MM.dd a hh:mm:ss",Locale.ENGLISH);
		System.out.println("3. "+sdf3.format(date));
		
		// 4
		SimpleDateFormat sdf4 = new SimpleDateFormat("E aa hh:mm:ss");
		System.out.println("4. "+sdf4.format(date));
		
		// 5
		SimpleDateFormat sdf5 = new SimpleDateFormat("E요일 aa hh:mm:ss");
		System.out.println("5. "+sdf5.format(date));
		
		// 6
		SimpleDateFormat sdf6 = new SimpleDateFormat("E aa hh:mm:ss",Locale.ENGLISH);
		System.out.println("6. "+sdf6.format(date));
		
		// 현재 미국 날짜는?
//		SimpleDateFormat sdf7 = new SimpleDateFormat("yyyy/MM/dd E a hh:mm:ss",Locale.ENGLISH);
//		TimeZone timeZone = TimeZone.getTimeZone("America/New_York);
				
		// 디데이 계산기
		// 파라미터로 날짜를 입력받으면(String, yyy.mm.dd 포멧)
		// 오늘날짜와 해당 날짜의 차이를 비교하여
		// 차이 리턴( 10일 남았으면 10, 10일 지났으면 -10)
		
		// 2022.04.01 개원기념일
		// 2022.02.14 처음 온 날부터 며칠 지났는지
		
		System.out.println("개원기념일까지 d-day = "+calDday("2022.04.01"));
		System.out.println("학원 처음 온날부터 "+calDday("2022.02.14")+"일 지남");
		
		System.out.println("\n=======================\n");
		
		// 달력을 만들어주는 클래스를 만들어 주세요.
		ApiCalendar apiCal = new ApiCalendar(2022, 5);		// 여기서 값을 받기때문에 ApiCalendar 클래스 drawCal메소드에서 파라미터(int year, int month) 안넣어도됨.
		apiCal.drawCal();
		
		System.out.println("\n=============유니크 아이디 만들기=============\n");

		// 유니크 ID 생성
		// Guest 34323134 님 환영합니다.
		// 6자리의 랜덤숫자를 이용해서 만든다.
		// yyyyMMddHHmmssSSS + 랜덤수 6
		
		System.out.println(makeUniqId()+"님 환영합니다");// 메소드 만들어보자.
		
		
		
		// 내가 만든 d day계산기
		Date dateToday = new Date();
		SimpleDateFormat dayFormat = new SimpleDateFormat("yyyy.MM.dd");
		String today = dayFormat.format(dateToday);
		System.out.println(today);
		Date todayDate = dayFormat.parse(today);
		
		// Date todayDate = new Date(); 이렇게 하면 뒤에 시간, 분도 같이 나와서 시간이 15일 남은게 아니라 14일 남았다고 뜸. 그래서 위에처럼
									//  yyyy.mm.dd로 갖고옴. 뒤에 시간, 분 등은 0으로 처리됨.
		
		
		String openDay = "2022.04.01";
		Date openDate = dayFormat.parse(openDay);
		System.out.println(openDate);
		
		String firstDay = "2022.02.14";
		Date firstDate = dayFormat.parse(firstDay);
		
		long diffTF = firstDate.getTime()-todayDate.getTime();
		
		System.out.println("처음 온 날부터 며칠 지났나요 "+diffTF/(1000*60*60*24));
		
		long diffOT = openDate.getTime() - todayDate.getTime();
		System.out.println("개원기념일 며칠남았나요 "+diffOT/(1000*60*60*24));
		
		
		
		
		
		
		
		
	}// main 끝
	
	// 디데이 계산 메소드
	static long calDday(String dday) throws ParseException {
		// 오늘 날짜 구하기
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		Date today = new Date();	// 2022.03.17 16:33:43 ~
		// 2022.03.18 00:00:00 - 2022.03.17 16:33:43 = 8시간 
		// 2022.03.17 00:00:00 으로 만들어야 날짜(일) 계산이 용이 
		String strToday = sdf.format(today);
		// strToday = 2022.03.17
		Date sdfToday = sdf.parse(strToday);
		// sdfToday = 2022.03.17. 00:00:00 세팅된 Date 객체
		
		Date inputDay = sdf.parse(dday);
		
		long diffMillSec = inputDay.getTime() - sdfToday.getTime();
		long diffDay = diffMillSec / (1000*60*60*24);

		return diffDay;
		
		
	}
	// 유니크 아이디 만들기
	public static String makeUniqId () {
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		String nowDay = sdf.format(now);
		for(int i = 0; i<6; i++) {
			int ranNum = (int)(Math.random()*10);
			nowDay += ranNum;
		}
		return nowDay;
	} 
	
	
	
}
