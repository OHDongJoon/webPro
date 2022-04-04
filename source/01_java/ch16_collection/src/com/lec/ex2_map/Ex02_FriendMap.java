package com.lec.ex2_map;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
public class Ex02_FriendMap {
	public static void main(String[] args) {
		HashMap<String, Friend> friends = new HashMap<String, Friend>();
		friends.put("010-9999-9999", new Friend("ȫ�浿", "010-9999-9999"));
		friends.put("010-8888-9999", new Friend("��浿", "010-8888-9999"));
		friends.put("010-7777-9999", new Friend("�ű浿", "010-7777-9999"));
		friends.put("010-6666-9999", new Friend("���浿", "010-6666-9999"));
		friends.put("010-5555-9999", new Friend("���浿", "010-5555-9999", new Date(95,12,12)));
		Iterator<String> iterator = friends.keySet().iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(key + "�� �����ʹ� " + friends.get(key));
		}
	}
}
