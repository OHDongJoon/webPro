package com.lec.ex1_string;
import java.util.Scanner;
// ����. �ֹι�ȣ�� �Է¹޾� �������� �������� ��� ����. �ֹι�ȣ�� ��920225-2012121���������� �Է¹޴´�.
public class Ex04_juminNo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ֹι�ȣ ?");
		String juminNo = scanner.next(); // 001212-4123456
		// ���1. charAt()�Լ� �̿�
//		char gender = juminNo.charAt(7);
//		if(gender=='1' || gender=='3') {
//			System.out.println("����� �����Դϴ�");
//		}else if(gender=='2' || gender=='4') {
//			System.out.println("����� �����Դϴ�");
//		}else {
//			System.out.println("�� �̻��ϴ�");
//		}
		// ���2. substring ����� ���ڷ� �ٲ㼭 ���
//		int gender = Integer.parseInt(juminNo.substring(7, 8));
//		String msg = (gender==1 || gender==3)? "����":
//							(gender==2||gender==4)? "����":"����";
		// ���3. 
		String gender = juminNo.substring(7,8);  // 001212-41212   "4"
		String msg = (gender=="1")||gender.equals("3")) ? "����":
							(gender.equals("2") || gender.equals("4"))? "����":"����";
		System.out.printf("����� %s�Դϴ�",msg);
		scanner.close();
		
	}
}









