package com.lec.ex3_math;
public class Ex03_random {
	public static void main(String[] args) {
		System.out.println("0~ 45�̸��� double ���� : " + Math.random()*45);
		System.out.println("0~ 45�̸��� ���� ���� : " + (int)(Math.random()*45) );
		System.out.println("�ζ� ��ȣ �̱� : " + ( (int)(Math.random()*45) +1 ) );
		 /* 0 <= Math.random()*45 < 45 
		 * 0~44������ ���� ���� : (int)(Math.random()*45) 
		 * 1~45������ ���� ���� : (int)(Math.random()*45) +1
		 * */
	}
}
