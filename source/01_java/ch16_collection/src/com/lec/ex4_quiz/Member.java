package com.lec.ex4_quiz;

public class Member {
	private String name;
	private String phone;
	private String address;
	// new Customer("ȫ�浿","010-9999-9999","����� ������ ���굿");
	public Member() {}
	public Member(String name, String phone, String address) {
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	@Override
	public String toString() {
		return name +"\t" + phone +"\t" + address;
	}
	public String getPhone() {
		return phone;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
