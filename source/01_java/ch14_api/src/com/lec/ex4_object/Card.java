package com.lec.ex4_object;
// �� �� �� �� ��翡  1-13 ����
public class Card {
	private char kind;  // �� �� �� ��
	private int  num;   // 1~13
	public Card(char kind, int num) {
		this.kind = kind;
		this.num = num;
	}
	@Override
	public String toString() {
		return "ī��� " + kind + ", " + num;
	}
	// c1.equals(c2) => c1�� kind�� c2�� kind, c1�� num�� c2�� num�� ��
}
