package com.lec.ex1_string;
// String 수정(10만번) > StringBuffer 수정(10만번) > StringBuilder 수정(10만번)
public class Ex11_speedCheck {
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis()); // 1970년1월1일부터 지금까지의 밀리세컨
		// 스트링 변경(10만번) - 시간체크
		String str = "A";
		long startTime = System.currentTimeMillis(); // 로직 시작시점의 1970.1.1부터의 밀리세컨
		for(int i=0 ; i < 100000 ; i++) { // 10만번 수정
			str = str + "a";
		}
		long endTime = System.currentTimeMillis(); // 로직 끝나는 시점의 1970.1.1부터의 밀리세컨
		
		
		// StringBuffer 변경(10만번) - 시간체크
		StringBuffer strBuf = new StringBuffer("A");
		
		
		// StringBuilder 변경(10만번) - 시간체크
		StringBuilder strBuld = new StringBuilder("A");
	}
}
