package com.lec.ex3_exceptionExs;
import java.text.SimpleDateFormat;
// Friend f = new Friend("ȫ�浿", "010-9999-9999")
// Friend f = new Friend("ȫ�浿")
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
	public String toString() {// sysout(f) => [�̸�]ȫ�浿 [��ȭ]***-****-9999 [�Է���]22��4��1��ģ����
		String telPost;                                 //   [�̸�]ȫ�浿 [��ȭ]����                    [�Է���]22��4��1��ģ����
		if(tel!=null) {
			String post = tel.substring(tel.lastIndexOf('-')+1); 
			telPost = "***-****-" + post;
		}else {
			telPost = "����\t\t";
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yy��M��d��ģ����");
		//return "[�̸�]" + name + "\t[��ȭ]" + telPot + "\t[�Է���]" + sdf.format(enterDate);
		return String.format("[�̸�]%s\t[��ȭ]%s\t[�Է���]%s", name, telPost, sdf.format(enterDate));
	}
	public void setEnterDate(Date enterDate) {
		this.enterDate = enterDate;
	}
}



