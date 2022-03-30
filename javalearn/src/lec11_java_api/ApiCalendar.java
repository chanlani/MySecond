package lec11_java_api;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ApiCalendar {
	int year;
	int month;

	public ApiCalendar(int year, int month) {
		super();
		this.year = year;
		this.month = month;
	}

	@Override
	public String toString() {
		return "MakeCalendar [year=" + year + ", month=" + month + "]";
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void drawCal() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month - 1, 1);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		int lastDay = calendar.getActualMaximum(calendar.DAY_OF_MONTH); // n월의 마지막 날
		int startDay = calendar.get(Calendar.DAY_OF_WEEK); // 그달의 첫번째 요일을 숫자로 가져온다. 첫번째 날 1일이 금요일이면 6을 가져옴.
		System.out.println(year + "년 " + month + "월 달력");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		int currentDay = 1;
		for (int i = 1; i <= 42; i++) {
			if (i >= startDay) {
				System.out.printf("%2d\t", currentDay);
				currentDay += 1;
				if (currentDay > lastDay) {
					break;
				}
			} else {
				System.out.print("\t");
			}
			if (i % 7 == 0) {
				System.out.println();
			}

		}

	}

	public void drawWeekDay() {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, 1);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		int lastDay = cal.getActualMaximum(cal.DAY_OF_MONTH);
		int startDay = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(year + "년 " + month + "월 달력 (주말 제외)");
		System.out.println("월\t화\t수\t목\t금");
		int currentDay = 1;
		for (int i = 1; i <= 42; i++) {
			if (i >= startDay) {

				if (i % 7 == 1) {
					currentDay += 1;
				} else if (i % 7 == 0) {
					currentDay += 1;
				} 
				else {
					System.out.printf("%2d\t", currentDay);
					currentDay += 1;
					if (currentDay > lastDay) {
						break;
					}
				}

			} else {
				if(i != 1) {
					System.out.print("\t");
				}
			}
			if (i % 7 == 0) {
				System.out.println();
			}

		}

	}

}
