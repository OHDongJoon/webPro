package com.lec.ex2_date;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.lec.ex1_string.Friend;
public class Ex06_FriendSimplDateFormat {
	public static void main(String[] args) {
		Friend[] friends = {new Friend("ȫ�浿", "010-9999-9999", "04-28"), 
				new Friend("���浿", "010-8888-8888", "02-28"), 
				new Friend("�ű浿", "010-7777-7777", "05-28")};
		/* ����ڷκ��� �˻��� ��ȭ��ȣ ���ڸ��� �Է¹޾�   => �ý������κ��� ��¥�� �޾� "MM-dd" ��Ÿ���� String���� ��ȯ "03-28"
		 * 0~������� �ش� ��ȭ��ȣ�� ������ ���              => 0~������� �ش� ���ϰ� ������ ��ȯ�� ��Ʈ�� "03-28" ������ ���
		 * �˻��� ���� �ʾ� ��� ���ϸ� ���µ���� ���       => �ش�����ڰ� ���� ����� ���ϸ� ���µ���� ���
		 */
		Date today = new Date(); 
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
		String todayStr = sdf.format(today);
//		System.out.println(todayStr);
		boolean searchOk = false;
		for(Friend friend : friends) {
			String birthday = friend.getBirthday(); // �ش� ��°�� ��ü ���ϰ� get
			if(birthday.equals(todayStr)) {
				System.out.println(friend);
				searchOk = true;
			}// if - �ش� �������̸� ���
		}// for
		if(!searchOk) {
			System.out.println("���� ������ ģ���� �����ϴ�");
		}
	}
}















