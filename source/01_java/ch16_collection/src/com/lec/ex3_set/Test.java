package com.lec.ex3_set;

public class Test {
	public static void main(String[] args) {
		String msg = "Hi~";
		String msg1 = "Hi~";
		String msg2 = new String("Hi~");
		System.out.println(msg==msg1? "���� �ּ�":"�ٸ� �ּ�");
		System.out.println(msg==msg2? "���� �ּ�":"�ٸ� �ּ�");
		System.out.println(msg.hashCode());
		System.out.println(msg1.hashCode());
		System.out.println(msg2.hashCode());
	}
}
