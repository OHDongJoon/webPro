package com.lec.ex4_quiz;
import java.util.ArrayList;
import java.util.Scanner;
public class TestMain1_ArrayList {
	public static void main(String[] args) {
		ArrayList<Member> members = new ArrayList<Member>();
		Scanner scanner = new Scanner(System.in);
		String answer, name, phone, address;
		while(true) {
			System.out.print("ȸ������ �����Ͻðڽ��ϱ� (Y/N)?");
			answer = scanner.next();
			if(answer.equalsIgnoreCase("n")) {
				break;
			}else if(answer.equalsIgnoreCase("y")) {
//				Member member = new Member();
//				System.out.print("�����Ͻ� ȸ���� �̸��� ?");
//				member.setName(scanner.next());
//				System.out.print("�����Ͻ� ȸ���� ��ȭ��ȣ�� ?");
//				member.setPhone(scanner.next());;
//				System.out.print("�����Ͻ� ȸ���� �ּҴ� ?");
//				scanner.nextLine(); // ��������� �뵵
//				member.setAddress(scanner.nextLine());
//				members.add(member);
				System.out.print("�����Ͻ� ȸ���� �̸��� ?");
				name = scanner.next();
				System.out.print("�����Ͻ� ȸ���� ��ȭ��ȣ�� ?");
				phone = scanner.next();
				scanner.nextLine(); // ��������� �뵵
				System.out.print("�����Ͻ� ȸ���� �ּҴ� ?");
				address = scanner.nextLine();
				members.add(new Member(name, phone, address));
			}
		}
		scanner.close();
		if(members.isEmpty()) {
			System.out.println("�� ������ ȸ���� �����ϴ� ��");
		}else {
			System.out.println("�� ������ ȸ�� ����Ʈ ��� ��");
			for(Member m : members) {
				System.out.println(m);
			} // for - ���
		}// if
	}// main
}
