package com.lec.ex1_string;
import java.util.Scanner;
// ��ȭ��ȣ �޾�, �Է¹��� ��ȭ��ȣ, ¦����° ����, ���ٷ�, ��ȭ��ȣ ���ڸ�, ��ȭ��ȣ ���ڸ�
public class Ex06_telPrint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("��ȭ��ȣ�� �Է��ϼ���(010-9898-1234 ����)");
		String tel = sc.next(); // ��Ʈ�� �Է�
		System.out.println("�Է��� ��ȭ��ȣ : "+tel);
		System.out.print("¦����° ���ڿ� : ");
		for(int i=0 ; i<tel.length() ; i++) {
			if(i%2 == 0) {
				System.out.print(tel.charAt(i)); // ¦����° ���� ���
			}else {
				System.out.print(' '); // Ȧ����° ���ڿ� ��� ' ' ���
			}
		}
		System.out.println(); // ����
		System.out.print("���ڸ� ���ٷ� :");
		for(int i=tel.length()-1 ; i>=0 ; i--) {
			System.out.print(tel.charAt(i));
		}
		System.out.println();
		String pre = "��ȭ��ȣ ���ڸ�";
		String post = "��ȭ��ȣ ���ڸ�";
		System.out.println("��ȭ��ȣ ���ڸ� : "+pre);
		System.out.println("��ȭ��ȣ ���ڸ� : "+post);
	}
}

