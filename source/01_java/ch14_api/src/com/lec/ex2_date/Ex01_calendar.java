package com.lec.ex2_date;
import java.util.Calendar;
public class Ex01_calendar {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); // �̱��� Ŭ����
		System.out.println(cal); // ������ ����
		int year = cal.get(Calendar.YEAR); // �⵵
		int month = cal.get(Calendar.MONTH)+1; // ��(Calendar.MONTH) 0,1,2,3...11��
		System.out.printf("%d�� %d��", year, month);
	}
}
