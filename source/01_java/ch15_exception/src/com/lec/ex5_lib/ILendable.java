package com.lec.ex5_lib;

public interface ILendable {
	public /* static final */byte STATE_BORROWED = 1; // ������
	public byte STATE_NORMAL = 0;  // ���Ⱑ��
	public void checkOut(String borrower) throws Exception; // ����
	public void checkIn() throws Exception; // �ݳ�
}
