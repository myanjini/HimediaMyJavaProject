package test;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarExample {

	public static void main(String[] args) {
		// 로스앤젤러스의 시간을 출력
		TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
		Calendar now = Calendar.getInstance(timeZone);
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = "";
		switch(week) {
		case Calendar.MONDAY: strWeek = "월"; break;
		case Calendar.TUESDAY: strWeek = "화"; break;
		case Calendar.WEDNESDAY: strWeek = "수"; break;
		case Calendar.THURSDAY: strWeek = "목"; break;
		case Calendar.FRIDAY: strWeek = "금"; break;
		case Calendar.SATURDAY: strWeek = "토"; break;
		case Calendar.SUNDAY: strWeek = "일"; break;
		}
		
		System.out.printf("%d년 %d월 %d일 (%s요일)\n", year, month, day, strWeek);
	}

}
