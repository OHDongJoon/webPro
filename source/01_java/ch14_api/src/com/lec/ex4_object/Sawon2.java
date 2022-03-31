package com.lec.ex4_object;
// Sawon2 s3 = new Sawon2("c01","���浿", Dept2.COMPUTER)
import java.text.SimpleDateFormat;
//Sawon s1 = new Sawon("a01", "ȫ�浿", Dept.COMPUTER) - ���� �Ի���
//Sawon s2 = new Sawon("a02", "�ű浿", Dept.HUMANRESOURCES, 2022, 3, 24) - 3��24�� �Ի���
// System.out.println(s1) => [���]a01 [�̸�]ȫ�浿 [�μ�]COMPUTER [�Ի���]2022��3��24��(��)
import java.util.Date;
import java.util.GregorianCalendar;
public class Sawon2 {
	private String num;  // ���
	private String name; // �̸�
	private Dept2 dept; // �μ�
	private Date   hiredate; // �Ի���
	public Sawon2(String num, String name, Dept2 dept) {
		this.num = num;
		this.name = name;
		this.dept = dept;
		hiredate = new Date(); // �Ի����� ��������
	}
	public Sawon2(String num, String name, Dept2 dept, int y, int m, int d) {
		this.num = num;
		this.name = name;
		this.dept = dept;
		//hiredate = new Date(y-1900, m-1, d); // �Ի����� y�� m�� d�Ϸ� .
		hiredate = new Date(new GregorianCalendar(y, m-1, d).getTimeInMillis());
	}
	@Override
	public String toString() {// sysout(s1) => [���]a01 [�̸�]ȫ�浿 [�μ�]COMPUTER [�Ի���]2022��3��24��(��)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��M��d��(E)");
		String hiredateStr = sdf.format(hiredate);
		String dStr = "" + dept; // "PLANNING"
		if(dStr.length()>10) {
			return "[���]" + num + "\t[�̸�]" + name + "\t[�μ�]" + dept + "\t[�Ի���]" + hiredateStr;
		}else {
			return "[���]" + num + "\t[�̸�]" + name + "\t[�μ�]" + dept + "\t\t[�Ի���]" + hiredateStr;
		}// if
	}// toString
}//class






	