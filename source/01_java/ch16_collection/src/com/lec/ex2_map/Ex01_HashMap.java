package com.lec.ex2_map;
import java.util.ArrayList;
import java.util.HashMap;
public class Ex01_HashMap {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("aaa"); 
		System.out.println(list.get(0)); // list�迭�� collection�� index�� get��
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(11, "str11"); // 11key���� ������ "str11" �߰�
		System.out.println(hashMap);
	}
}
