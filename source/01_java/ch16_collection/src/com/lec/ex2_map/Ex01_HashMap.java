package com.lec.ex2_map;
import java.util.ArrayList;
import java.util.HashMap;
public class Ex01_HashMap {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("aaa"); 
		System.out.println(list.get(0)); // list계열의 collection은 index로 get함
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(11, "str11"); // 11key값에 데이터 "str11" 추가
		System.out.println(hashMap);
	}
}
