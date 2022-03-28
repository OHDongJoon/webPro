package com.lec.ex1_string;

public class Friend {
	private String name;
	private String tel;
	private String birthday;
	public Friend() { }
	public Friend(String name, String tel, String birthday) {
		this.name = name;
		this.tel = tel;
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "\n��  �� :" + name + "\n��  ȭ : " + tel + "\n��  �� : " + birthday;
	}
	public String getName() { return name; }
	public String getTel() { return tel; }
	public String getBirthday() { return birthday; }
}
