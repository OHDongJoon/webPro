package com.lec.ex4_object;
public class Ex04_RectangleTestMain {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.setHeight(10); r1.setWidth(5);
		Rectangle r2 = r1; // 복제
		System.out.println("r1 : " +r1);
		System.out.println("r2 : " +r2);
		System.out.println(r1.equals(r2)? "같은 사각형" : "다른 사각형");
		System.out.println(r1==r2 ? "복사한게 아니고 같은 주소를 가리킴":"다른 주소를 가르킴");
	}
}
