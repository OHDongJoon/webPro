package com.lec.ex4_quiz;
import java.util.HashMap;
public class Test {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(0, "str0");
		map.put(5, "str10");
		// ���1 ��õ
		if(map.get(5)!=null) {
			System.out.println("���� ��ȣ�� �־ put�� �Ұ�");
		}
		// ���2
//		Iterator<Integer> iterator = map.keySet().iterator();
//		boolean ok = false;
//		while(iterator.hasNext()) {
//			Integer key = iterator.next();
//			if(key.equals(0)) {
//				ok = true;
//				break;
//			}
//		}//
//		if(ok) {
//			System.out.println("���� ��ȣ�� �־ put�� �Ұ�");
//		}
	}
}
