package com.lec.ex2_date;
import java.util.Calendar;
public class Ex01_calendar {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); // 싱글톤 클래스
		System.out.println(cal); // 가독성 저하
		int year = cal.get(Calendar.YEAR); // 년도
		int month = cal.get(Calendar.MONTH)+1; // 월(Calendar.MONTH) 0,1,2,3...11월
		System.out.printf("%d년 %d월", year, month);
	}
}
