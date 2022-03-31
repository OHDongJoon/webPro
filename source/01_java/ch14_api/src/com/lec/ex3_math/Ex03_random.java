package com.lec.ex3_math;
public class Ex03_random {
	public static void main(String[] args) {
		System.out.println("0~ 45미만의 double 난수 : " + Math.random()*45);
		System.out.println("0~ 45미만의 정수 난수 : " + (int)(Math.random()*45) );
		System.out.println("로또 번호 뽑기 : " + ( (int)(Math.random()*45) +1 ) );
		 /* 0 <= Math.random()*45 < 45 
		 * 0~44까지의 정수 난수 : (int)(Math.random()*45) 
		 * 1~45까지의 정수 난수 : (int)(Math.random()*45) +1
		 * */
	}
}
