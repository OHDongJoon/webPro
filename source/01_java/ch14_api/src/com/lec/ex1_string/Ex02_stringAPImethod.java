package com.lec.ex1_string;
public class Ex02_stringAPImethod {
	public static void main(String[] args) {
		String str1 = "abcXabc";
		String str2 = new String("ABCXabc");
		String str3 = "       ja    va       ";
		System.out.println("1."+str1.concat(str2)); // 문자열결합 abcXabcABCXabc
		System.out.println("2."+str1.substring(3)); // 3번째부터끝까지 Xabc
		System.out.println("3."+str1.substring(3,5));//3번째부터 5번째앞까지 Xa
		System.out.println("4."+str1.length());  //글자길이 7
		System.out.println("5."+str1.toUpperCase()); // 대문자로 ABCXABC
		System.out.println("6."+str1.toLowerCase()); // 소문자로 abcxabc
		System.out.println("7."+str1.charAt(3)); // 3번째 문자 'X'
		System.out.println("8."+str1.indexOf('b')); // 첫번째 'b'가 나오는 인덱스 1
		System.out.println("9."+str1.indexOf('b', 3)); // 3번째부터검색해서 첫번째 'b' 위치5
		System.out.println("10."+str1.indexOf("abc")); // 첫번째 "abc"나오는 위치 0
		System.out.println("11."+str1.indexOf("abc",3)); // 3번째부터 검색해서 "abc"위치 4
		System.out.println("12."+str1.indexOf('z'));//없으면  -1
		System.out.println("13."+str1.lastIndexOf('b'));//마지막 'b' 위치 5
		System.out.println("14."+str1.lastIndexOf('b',3));//3번째부터 맨 마지막 b 1
		System.out.println("15."+str1.equals(str2)); // str1과 str2가 같은 문자열인지 false
		System.out.println("16."+str1.equalsIgnoreCase(str2));//대소문자구분없이 비교 true
		str1 = "abcXabc";
		str3 = "       ja    va       ";
		System.out.println("17."+str3.trim()); // 앞뒤 공백 제거 ja   va
		System.out.println("18."+str1.replace('a', '9'));//'a'를 '9'로 수정 9bcX9bc
		System.out.println("19."+str1.replace("abc", "＃"));// "abc"을 "#"으로 수정 #X#
		System.out.println("str3의 space를 없애기 : "+str3.replace(" ", ""));
		System.out.println("20."+str1.replaceAll("abc","Z"));// "abc"을 "z"
		System.out.println("20."+str1.replace("abc", "Z"));// "abc"을 "z"
		/*정규표현식  https://goo.gl/HLntbd
		 *       연습장 : http://www.nextree.co.kr/p4327  */
		String str = "안녕Hello"; // 영문자 다 *
		System.out.println(str.replaceAll("[a-zA-Z]", ""));//알파벳을 ""로 수정
		System.out.println(str.replaceAll("[가-힣]", "")); // 한글문자를 ""로 수정
		// 문자열 메소드는 문자열을 수정 안함
		System.out.println("str1 = "+str1);
		System.out.println("str2 = "+str2);
		System.out.println("str3 = "+str3);
		
	}
}














