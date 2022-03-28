package com.lec.ex2_date;
import com.lec.ex1_string.Friend;
public class Ex06_FriendSimplDateFormat {
	public static void main(String[] args) {
		Friend[] friends = {new Friend("홍길동", "010-9999-9999", "06-28"), 
				new Friend("마길동", "010-8888-8888", "03-28"), 
				new Friend("신길동", "010-7777-7777", "05-28")};
		/* 사용자로부터 검색할 전화번호 뒷자리를 입력받아   => 시스템으로부터 날짜를 받아 "MM-dd" 스타일의 String으로 변환 "03-28"
		 * 0~끝방까지 해당 전화번호가 있으면 출력              => 0~끝방까지 해당 생일과 위에서 변환한 스트링 "03-28" 같으면 출력
		 * 검색이 되지 않아 출력 못하면 없는데라고 출력       => 해당생일자가 없어 출력을 못하면 없는데라고 출력
		 */
	}
}
