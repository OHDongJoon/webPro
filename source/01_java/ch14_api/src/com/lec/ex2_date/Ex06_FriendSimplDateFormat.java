package com.lec.ex2_date;
import com.lec.ex1_string.Friend;
public class Ex06_FriendSimplDateFormat {
	public static void main(String[] args) {
		Friend[] friends = {new Friend("ȫ�浿", "010-9999-9999", "06-28"), 
				new Friend("���浿", "010-8888-8888", "03-28"), 
				new Friend("�ű浿", "010-7777-7777", "05-28")};
		/* ����ڷκ��� �˻��� ��ȭ��ȣ ���ڸ��� �Է¹޾�   => �ý������κ��� ��¥�� �޾� "MM-dd" ��Ÿ���� String���� ��ȯ "03-28"
		 * 0~������� �ش� ��ȭ��ȣ�� ������ ���              => 0~������� �ش� ���ϰ� ������ ��ȯ�� ��Ʈ�� "03-28" ������ ���
		 * �˻��� ���� �ʾ� ��� ���ϸ� ���µ���� ���       => �ش�����ڰ� ���� ����� ���ϸ� ���µ���� ���
		 */
	}
}
