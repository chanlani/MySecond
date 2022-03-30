package submit10_11.submit1.submit3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import lec09_class.UtilClass;

public class DateBoardMain {

	public static void main(String[] args) throws ParseException {
		ArrayList<DateBoard> dbList = new ArrayList<DateBoard>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");

		for (int i = 0; i < 30; i++) {
			int randMonth = (int) (Math.random() * 3) + 1; // 1~3
			int randDay = (int) (Math.random() * 28) + 1; // 1~28
			Calendar cal = Calendar.getInstance();
			cal.set(2022, randMonth - 1, randDay);

			String strDate = sdf.format(cal.getTime());
			dbList.add(new DateBoard(i + "번째 생성된 글", strDate));
		}

		for (int i = 0; i < dbList.size(); i++) {

			System.out.println(dbList.get(i));

		}
		System.out.println("\n=================\n");

		Date date = new Date();
		/*
		 * // date.getTime(); Date dateTime = sdf.parse(dbList.get(4).getDate()); //
		 * 날짜형식으로 변환 System.out.println(dateTime); long millTime = dateTime.getTime();
		 * // 밀리초로 변환 System.out.println(millTime);
		 */

		// 날짜별로 정렬
		// 1.버블정렬

		for (int i = 0; i < dbList.size(); i++) {
			for (int j = 0; j < dbList.size() - 1 - i; j++) {

				Date date1 = sdf.parse(dbList.get(j).getDate());
				Date date2 = sdf.parse(dbList.get(j + 1).getDate());

				if (date1.getTime() > date2.getTime()) {
					DateBoard temp = dbList.get(j);
					dbList.set(j, dbList.get(j + 1));
					dbList.set(j + 1, temp);
				}

			}
		}
		for (DateBoard db : dbList)
			System.out.println(db);

		System.out.println("\n=============================\n");

		// 최근 한달 내 작성된 게시글만 출력
		// day 30일, (3-14, 2-14)
		ArrayList<DateBoard> temp = new ArrayList<DateBoard>();

		Date today = new Date();

		long oneMonth = 1000 * 60 * 60 * 24 * 30L;

		for (int i = 0; i < dbList.size(); i++) {
			Date currDate = sdf.parse(dbList.get(i).getDate());

			if (today.getTime() - oneMonth < currDate.getTime()) {
				temp.add(dbList.get(i));
			}

		}
		for (DateBoard db : temp) {
			System.out.println(db);
		}
		System.out.println("이번달====================");
		// 이번달 작성된 게시글

		temp.clear();
		Calendar calToday = Calendar.getInstance();
		int month = calToday.get(Calendar.MONTH);
		int year = calToday.get(Calendar.YEAR);

		for (int i = 0; i < dbList.size(); i++) {
			Date currDate = sdf.parse(dbList.get(i).getDate());
			Calendar currCal = Calendar.getInstance();
			currCal.setTime(currDate);

			if (currCal.get(Calendar.YEAR) == year && currCal.get(Calendar.MONTH) == month) {
				temp.add(dbList.get(i));
			}
		}

		for (DateBoard db : temp) {
			System.out.println(db);
		}

		System.out.println("\n==============================\n");
		System.out.println("2022.02.14 ~ 2022.03.21 게시글");

		temp.clear();

		SimpleDateFormat newSdf = new SimpleDateFormat("yyyy.MM.dd"); // 새로운 심플데이터 생성

		Date fromDate = newSdf.parse("2022.02.14");
		Date toDate = newSdf.parse("2022.03.21");

		for (int i = 0; i < dbList.size(); i++) {
			Date currDate = sdf.parse(dbList.get(i).getDate());

			if ((fromDate.getTime() <= currDate.getTime()) && (currDate.getTime() <= toDate.getTime())) {
				temp.add(dbList.get(i));
			}
		}

		for (DateBoard db : temp) {
			System.out.println(db);

		}

//		Collections.sort(millTime1, Collections.reverseOrder());	// 밀리초로 변환된 값이 아니라 list를 넣어야함.

	}
}
