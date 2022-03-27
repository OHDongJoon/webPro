package com.lec.ex07_book1;
// Book b = new Book("890ㅁ-101-1ㄱ","java","홍길동")
public class Book implements ILendable {
	private String bookNo;    // 책번호 890ㅁ-101-1ㄱ
	private String bookTitle; // 책제목
	private String writer;    // 저자
	private String borrower;  // 대출인
	private String checkOutDate; // 대출일
	private byte state;       // 대출중(1), 대출가능(0)
	public Book(String bookNo, String bookTitle, String writer) {
		this.bookNo = bookNo;
		this.bookTitle = bookTitle;
		this.writer = writer;
//		borrower = null;
//		checkOutDate = null;
//		state = STATE_NORMAL;
	} 
	// b.checkOut("신길동","03-23"); 대출 : state를 확인해서 대출중(1)이면 중단, 대출가능(0)이면 대출처리
	@Override
	public void checkOut(String borrower, String checkoutDate) {
		if(state == STATE_BORROWED) { // 대출중이면 메세지 뿌리고 끝
			System.out.println(bookTitle +" 도서는 대출중입니다");
			return;
		}
		// state가 0이라 대출처리 진행
		this.borrower = borrower;
		this.checkOutDate = checkoutDate;
		state = STATE_BORROWED; // 대출중 상태로 전환
		System.out.println(bookTitle + " 도서가 대출 처리되었습니다");
		System.out.println("대출인 : "+borrower +"\t대출일 : "+checkoutDate);
	}
	// b.checkIn() 반납 : state 확인해서 대출가능(0)이면 메세지 뿌리고 중단, 대출중(1)이면 반납진행
	@Override
	public void checkIn() {
		if(state == STATE_NORMAL) {
			System.out.println(bookTitle + "도서는 반납완료된 책인데 이상합니다. 예외다");
			return;
		}
		// state가 대출중(1)이라 반납 진행
		borrower = null;
		checkOutDate = null;
		state = STATE_NORMAL;
		System.out.println(bookTitle +" 도서가 반납 완료되었습니다");
	}
	// b.printState() => 890ㅁ-101-1ㄱ java(홍길동 지음) 대출중
	@Override
	public void printState() {
		if(state==STATE_NORMAL) {
			System.out.println(bookNo + "\t" + bookTitle + "(" + writer + "지음) 대출가능");
		}else if(state==STATE_BORROWED) {
			System.out.println(bookNo + "\t" + bookTitle + "(" + writer + "지음) 대출중");
		}else {
			System.out.println(bookNo + "\t" + bookTitle + "(" + writer + "지음) 이상해");
		}
//		String msg = bookNo + "\t" + bookTitle + "(" + writer + "지음)";
//		msg = msg + ( (state==STATE_NORMAL)? "대출가능" : (state==STATE_BORROWED)? "대출중":"이상해" );
//		System.out.println(msg);
	}
	public String getBookNo() {
		return bookNo;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public String getWriter() {
		return writer;
	}
	public String getBorrower() {
		return borrower;
	}
	public String getCheckOutDate() {
		return checkOutDate;
	}
	public byte getState() {
		return state;
	}
}














