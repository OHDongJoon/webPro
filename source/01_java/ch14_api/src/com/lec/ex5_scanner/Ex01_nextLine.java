package com.lec.ex5_scanner;
import java.util.Scanner;
public class Ex01_nextLine {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���̸� �Է��ϼ��� : ?");
		int age = scanner.nextInt();//'\n'���� ���ڸ� return
		System.out.println("�Է��Ͻ� ���̴� "+age);
		
		System.out.print("�̸��� �Է��ϼ��� ?");
		String name = scanner.next(); // whitespace�ձ��� ���� return
		System.out.println("�Է��Ͻ� �̸��� "+name);
		
		System.out.print("�ּҸ� �Է��ϼ���?");
		scanner.nextLine(); // ���ۿ� ���� �ִ� '\n'�� ����� ����
		String address = scanner.nextLine(); // '\n' �տ� �ִ� ���� return�ϰ� '\n'���ʹ� �����
		System.out.println("�Է��Ͻ� �ּҴ� "+address);
		scanner.close();
	}
}
