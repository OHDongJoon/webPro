package com.lec.ex3_math;
import java.util.Random;
/* 0 <= Math.random()*45 < 45 
 * 0~44������ ���� ���� : (int)(Math.random()*45) 
 * 1~45������ ���� ���� : (int)(Math.random()*45) +1
 * */
public class Ex03_random {
	public static void main(String[] args) {
		System.out.println("0~ 45�̸��� double ���� : " + Math.random()*45);
		System.out.println("0~ 45�̸��� ���� ���� : " + (int)(Math.random()*45) );
		System.out.println("�ζ� ��ȣ �̱� : " + ( (int)(Math.random()*45) +1 ) );
		Random random = new Random();
		System.out.println("int ���� : " + random.nextInt());
		System.out.println("double ���� : " + random.nextDouble());  // Math.random() ����
		System.out.println("T/F �� �ϳ� ���� : " + random.nextBoolean());
		System.out.println("0~44������ ���� ���� : " + random.nextInt(45)); // 0~ 45�̸��� ���� ����
		System.out.println("�ζ� ��ȣ �̱� : " + (random.nextInt(45)+1)   );
	}
}
