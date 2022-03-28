package com.lec.ex1_string;

import java.util.Scanner;

public class Ex08_FriendSearchTestMain {
	public static void main(String[] args) {
		Friend[] friends = {new Friend("ȫ�浿", "010-9999-9999", "05-22"),
				new Friend("�ű浿", "010-8888-8888", "03-28"),
				new Friend("���浿", "010-8888-9999", "08-22"),
				new Friend("���浿", "010-7777-7777", "04-22"),
				new Friend("��浿", "010-6666-7777", "03-22")};
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("�˻��ϰ��� �ϴ� ģ���� ��ȭ��ȣ ���ڸ��� ?");
			String searchTel = sc.next() ; // ����ڷκ��� ��ȭ��ȣ �޹�ȣ �Է� ���� ������ �Ҵ�
			if(searchTel.equals("x")) break;
			boolean searchOk = false;
			for(int idx=0 ; idx<friends.length ; idx++) {
				// idx��°�� Friend��ü ��ȭ��ȣ ���ڸ� ����
				String tel = friends[idx].getPhone();
				String post = tel.substring(tel.lastIndexOf('-')+1);
//				String post = friends[idx].getPhone().substring(friends[idx].getPhone().lastIndexOf('-')+1);
				if(post.equals(searchTel)) {
					System.out.println(friends[idx]);
					searchOk = true;
				}// if - ��ȭ��ȣ�� ã�� ��� ���̻� �˻����� �ʰ� for�� ��������.
			}//for
			if(! searchOk) {
				System.out.println("�˻��Ͻ� ģ���� ��ȸ���� �ʽ��ϴ�.");
			}// if
		}//while
		sc.close();
	}//main
}//class
