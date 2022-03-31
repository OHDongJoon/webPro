package com.lec.ex4_object;
//Sawon s1 = new Sawon("a01", "홍길동", Dept.COMPUTER) - 오늘 입사일
//Sawon s2 = new Sawon("a02", "신길동", Dept.HUMANRESOURCES, 2022, 3, 24) - 3월24일 입사일
// System.out.println(s1) => [사번]a01 [이름]홍길동 [부서]COMPUTER [입사일]2022년3월24일(목)
import java.util.Date;
public class Sawon {
	private String num;  // 사번
	private String name; // 이름
	private String dept; // 부서
	private Date   hiredate; // 입사일
}
