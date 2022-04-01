package com.lec_ex1_tryCatch;
import java.util.InputMismatchException;
import java.util.Scanner;
// ���� : ArithmeticException, InputMismatchException
public class Ex03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i, j=1;
		do {
			try {
				System.out.print("��Ģ������ ù��° ���� ?");
				i = scanner.nextInt();
				break;
			}catch(InputMismatchException e) {
				System.out.println("���� �޼��� : " + e.getMessage());
				System.out.println("������ �ݵ�� �Է��ϼ���");
				scanner.nextLine(); // ���۸� ����� ����
			}
		}while(true);
		System.out.print("��Ģ������ �ι�° ���� ?");
		try {
			j = scanner.nextInt();
			System.out.println("i = " + i + ", j = " + j);
			System.out.println("i * j = " + (i*j));
			System.out.println("i / j = " + (i/j)); 
		}catch(InputMismatchException e) {
			System.out.println("���� �޼��� : " + e.getMessage());
			System.out.println("�ι�° ���� �߸� �Է��Ͻø� 1�� �ʱ�ȭ ��");
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("i + j = " + (i+j));
		System.out.println("i - j = " + (i-j));
		System.out.println("DONE");
		scanner.close();
	}
}









