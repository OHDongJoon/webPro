package com.lec.ex4_quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class TestMain2_HashMap {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String answer, name, phone, address;
		HashMap<String, Member> members = new HashMap<String, Member>();
		do {
			System.out.print("ȸ������ �����Ͻðڽ��ϱ�(Y/N)? ");
			answer = scanner.next();
			if(answer.equalsIgnoreCase("n")) {
				break;
			}else if(answer.equalsIgnoreCase("y")){ // ȸ������ ����
				System.out.print("�����Ͻ� ȸ���� �̸��� ?");
				name = scanner.next();
				System.out.print("�����Ͻ� ȸ���� ��ȭ��ȣ�� ?");
				phone = scanner.next();
				// ������ ������ ��ȭ��ȣ���� Ȯ���ϴ� ���1
				if(members.get(phone) !=null) { 
					System.out.println("�̹� ���ԵǾ� �ִ� ��ȭ��ȣ�Դϴ�. ��ȭ��ȣ�� �ߺ��� �� �����ϴ�");
					continue;
				}
				// ������ ������ ��ȭ��ȣ���� Ȯ���ϴ� ���2
//				Iterator<String> iterator = members.keySet().iterator();
//				boolean phoneChk = false;
//				while(iterator.hasNext()) {
//					String key = iterator.next();
//					if(members.get(key).getPhone().equals(phone)) {
//						phoneChk = true;
//						break;
//					}
//				}//while - ȸ�� ��Ͽ� �ش� ��ȭ��ȣ�� �ִ���?
//				if(phoneChk) {
//					System.out.println("�̹� ���ԵǾ� �ִ� ��ȭ��ȣ�Դϴ�. ��ȭ��ȣ�� �ߺ��� �� �����ϴ�");
//					continue;
//				}
				System.out.print("�����Ͻ� ȸ���� �ּҴ� ?");
				scanner.nextLine(); // ��������� �뵵
				address = scanner.nextLine();
				members.put(phone, new Member(name, phone, address));
			}
		}while(true);
		scanner.close();
		if(members.isEmpty()) {
			System.out.println("�� ������ ȸ���� �����ϴ� ��");
		}else {
			System.out.println("�� ������ ȸ�� ����Ʈ ��� ��");
			Iterator<String> iterator = members.keySet().iterator();
			while(iterator.hasNext()) {
				System.out.println(members.get(iterator.next()));
			}//while - ȸ�� ��� ���
		}//if - ������ ȸ�� ����
	}
}
