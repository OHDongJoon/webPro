package com.lec.ex4_object;
public class Person {
	private long juminNo; // 9512121025252
	public Person(long juminNo) {
		this.juminNo = juminNo;
	}
	@Override
	public String toString() {
		return "Person [juminNo=" + juminNo + "]";
	}
	@Override
	public boolean equals(Object obj) { 
		// p1.equals(p2)ȣ���� ��� p1��� this, p2��� obj => ����ü�� juminNo�� obj.juminNo�� ������ ���θ� return
		// p1.equals(p3)ȣ���� ��� p3��� obj => false�� return
		if(obj !=null && obj instanceof Person) { // obj�� Person Ÿ���� ��ü
			return juminNo == ((Person)obj).juminNo;
		}else {
			return false;
		}// if
	}// equals
}
