package com.lec.ex5_scanner;
import java.util.Scanner;
public class ex03_scannerClose {
	public static void main(String[] args) {
		Scanner scMain = new Scanner(System.in);
		System.out.print("�̸� ?");
		String name = scMain.nextLine();
		System.out.println("�Է��Ͻ� �̸��� "+name);
		nickName();
		System.out.print("���� ?");
		int age = scMain.nextInt();
		System.out.println("�Է��Ͻ� ���̴� "+age);
		scMain.close();
	}
	private static void nickName() { // ����ڷκ��� ������ ����ϴ� �޼ҵ�
		Scanner scNickName = new Scanner(System.in);
		System.out.print("������ ?");
		System.out.println("�Է��Ͻ� ������ " + scNickName.nextLine());
//		scNickName.close(); ��ĳ�� ��ü�� close�� main������
	}
}
