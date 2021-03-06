package com.lec.ex3_exceptionExs;
import java.text.SimpleDateFormat;
// Friend f = new Friend("홍길동", "010-9999-9999")
// Friend f = new Friend("홍길동")
import java.util.Date;
public class Friend {
	private String name;
	private String tel;
	private Date enterDate;
	public Friend(String name) {
		this.name = name;
		enterDate = new Date();
	}
	public Friend(String name, String tel) {
		this.name = name;
		this.tel = tel;
		enterDate = new Date();
	}
	@Override
	public String toString() {// sysout(f) => [이름]홍길동 [전화]***-****-9999 [입력일]22월4월1일친구됨
		String telPost;                                 //   [이름]홍길동 [전화]없음                    [입력일]22월4월1일친구됨
		if(tel!=null) {
			String post = tel.substring(tel.lastIndexOf('-')+1); 
			telPost = "***-****-" + post;
		}else {
			telPost = "없음\t\t";
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yy년M월d일친구됨");
		//return "[이름]" + name + "\t[전화]" + telPot + "\t[입력일]" + sdf.format(enterDate);
		return String.format("[이름]%s\t[전화]%s\t[입력일]%s", name, telPost, sdf.format(enterDate));
	}
	public void setEnterDate(Date enterDate) {
		this.enterDate = enterDate;
	}
}




