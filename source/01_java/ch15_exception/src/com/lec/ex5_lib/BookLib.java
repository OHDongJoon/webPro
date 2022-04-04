package com.lec.ex5_lib;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class BookLib implements ILendable {
	private String bookNo;    // å��ȣ
	private String bookTitle; // å�̸�
	private String writer;    // ����
	private String borrower;  // ������
	private Date checkOutDate;// ������
	private byte state;       // ������(1) or ���Ⱑ��(0)
	public BookLib(String bookNo, String bookTitle, String writer) {
		this.bookNo = bookNo;
		this.bookTitle = bookTitle;
		this.writer = writer;
	}
	// BookLib book = new BookLib("89a-01", "java", "ȫ�浿");
	// book.checkOut("�ű浿") : �������� Ȯ�� -> ������� -> �����������
	@Override
	public void checkOut(String borrower) throws Exception {
		if(state==STATE_BORROWED) {
			throw new Exception(bookTitle + "������ �ڴ����ߡ��Դϴ�"); // ������ ���� �߻�
		}
		// �������
		this.borrower = borrower;
		checkOutDate = new Date();
		state = STATE_BORROWED;
		// "java" ������ ����Ǿ����ϴ�. ������:�ű浿 / ������:2022-4-4(��) 2�ֳ��� �ݳ��ϼ���
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-d(E)");
		System.out.println("\"" + bookTitle + "\" ������ ����Ǿ����ϴ�");
		System.out.println("������ : "+borrower +" / ������ : " + sdf.format(checkOutDate) + "2�ֳ��� �ݳ��ϼ���");
	}
	// book.checkIn() : �������� Ȯ�� -> ��ü���� Ȯ�� -> (if. ��ü�Ǿ��� ��� ��ü�� ����y/n) -> �ݳ����� -> �����������
	@Override
	public void checkIn() throws Exception {
		if(state == STATE_NORMAL) {
			throw new Exception(bookTitle + "������ �������� �ƴϿ���");
		}
		// ��ü���� Ȯ�� checkOutDate ~ ������� 14���̳����� ����
		Date now = new Date();
		long diff = now.getTime() - checkOutDate.getTime(); // ����������� ��������� �и�����
		long day = diff / (1000*60*60*24);
		if(day > 14) { // ��ü�� ���
			System.out.println("��ü��� ���� 100�� �ΰ��˴ϴ�. ���ž��� ��ü��� " + (day-14)*100 +"��");
			Scanner scanner = new Scanner(System.in);
			System.out.print("��ü�Ḧ ���̳��� (Y/N) ?");
			if(! scanner.next().equalsIgnoreCase("y")) { // Y/y�� �Է����� ���� ���
				System.out.println("��ü�Ḧ ���ž� �ݳ�ó���� �����մϴ�. ��ü�Ḧ ������");
				return;
			}
		}
		// �ݳ�����
		borrower = null;
		checkOutDate = null;
		state = STATE_NORMAL;
		System.out.println("\""+bookTitle+"\"������ �ڹݳ��ڵǾ����ϴ�");
	}
	// sysout(book) -> å��ȣ:89��-01 å�̸�:java ����:ȫ�浿  ���Ⱑ��
	//              -> å��ȣ:89��-01 å�̸�:java ����:ȫ�浿  ������(������:2022-4-4(��))                                
	@Override
	public String toString() {
		String msg = "å��ȣ : " + bookNo + "\tå�̸� :" + bookTitle +"\t����" + writer;
		msg += (state == STATE_NORMAL)? "\t���Ⱑ�� " : "\t������ ";
		if(state == STATE_BORROWED) {
			SimpleDateFormat sdf = new SimpleDateFormat("(������ : yyyy-M-d(E))");
			msg += sdf.format(checkOutDate);
		}
		return msg;
	}
	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
}
















