package com.lec.ex3_exceptionExs;
public class Ex03_numberFormat {
	public static void main(String[] args) {
//		int i = Integer.parseInt(""); // ��Ʈ���� ���ڷ� ��ȯ �� �� ���ܹ߻�
		int i = Integer.parseInt("100 "); // space�� ���� ���ܹ߻���
		System.out.println(i);
	}
}
