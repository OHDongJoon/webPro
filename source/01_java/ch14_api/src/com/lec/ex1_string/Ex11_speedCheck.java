package com.lec.ex1_string;
// String ����(10����) > StringBuffer ����(10����) > StringBuilder ����(10����)
public class Ex11_speedCheck {
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis()); // 1970��1��1�Ϻ��� ���ݱ����� �и�����
		// ��Ʈ�� ����(10����) - �ð�üũ
		String str = "A";
		long startTime = System.currentTimeMillis(); // ���� ���۽����� 1970.1.1������ �и�����
		for(int i=0 ; i < 100000 ; i++) { // 10���� ����
			str = str + "a";
		}
		long endTime = System.currentTimeMillis(); // ���� ������ ������ 1970.1.1������ �и�����
		
		
		// StringBuffer ����(10����) - �ð�üũ
		StringBuffer strBuf = new StringBuffer("A");
		
		
		// StringBuilder ����(10����) - �ð�üũ
		StringBuilder strBuld = new StringBuilder("A");
	}
}
