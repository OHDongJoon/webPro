package com.lec.ex4_object;
//Sawon s1 = new Sawon("a01", "ȫ�浿", Dept.COMPUTER) - ���� �Ի���
//Sawon s2 = new Sawon("a02", "�ű浿", Dept.HUMANRESOURCES, 2022, 3, 24) - 3��24�� �Ի���
// System.out.println(s1) => [���]a01 [�̸�]ȫ�浿 [�μ�]COMPUTER [�Ի���]2022��3��24��(��)
import java.util.Date;
public class Sawon {
	private String num;  // ���
	private String name; // �̸�
	private String dept; // �μ�
	private Date   hiredate; // �Ի���
}
