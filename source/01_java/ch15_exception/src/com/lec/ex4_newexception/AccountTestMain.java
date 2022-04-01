package com.lec.ex4_newexception;
public class AccountTestMain {
	public static void main(String[] args) {
		Account obj1 = new Account("111-111", "ȫ�浿");
		Account obj2 = new Account("222-222", "�ű浿", 2000);
		obj1.deposit(1000);
		obj2.deposit(1000);
		try {
			obj1.withdraw(500);
		} catch (Exception e) {
			System.out.println("���ܸ޼��� : "+e.getMessage());
		} // withdraw �޼ҵ� ����� throws�� ������ ȣ��ÿ��� try-catch
		try {
			obj2.withdraw(30000);
		} catch (Exception e) {
			System.out.println("���ܸ޼��� : "+e.getMessage());
		}
	}
}
