package com.lec.ex2_map;
import java.text.SimpleDateFormat;
import java.util.Date;
// Friend f = new Friend("ȫ","010-9999-9999");
public class Friend {
	private String name;
	private String tel;
	private Date   birth;
	public Friend(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public Friend(String name, String tel, Date birth) {
		super();
		this.name = name;
		this.tel = tel;
		this.birth = birth;
	}
	// sysout(f) => ȫ�� ����ó 010-9999-9999, ����:04��14��
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("���� : MM�� dd��");
		if(birth !=null) {
			return name + "�� ����ó : " + tel + ", " + sdf.format(birth);
		}else {
			return name + "�� ����ó : " + tel;
		}//if
	}//toString
} // class









