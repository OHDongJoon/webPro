package com.lec_ex1_tryCatch;
import java.util.Scanner;
// ���� ó�� ����
public class Ex01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("��Ģ������ ù��° ���� ?");
		int i = scanner.nextInt();
		System.out.print("��Ģ������ �ι�° ���� ?");
		int j = scanner.nextInt();
		System.out.println("i = " + i + ", j = " + j);
		System.out.println("i * j = " + (i*j));
		System.out.println("i / j = " + (i/j)); // ���ܰ� �߻��� �� �ִ� �κ�
		System.out.println("i + j = " + (i+j));
		System.out.println("i - j = " + (i-j));
		System.out.println("DONE");
		scanner.close();
	}
}