package com.lec.ex1_list;
import java.util.ArrayList;
public class Ex01_ArrayList {
	public static void main(String[] args) {
		String[] array = new String[4];
		//int[] arr = new int[3];
		array[0] = "str0"; array[1]="str1"; array[2]="str3";
		for(int i=0 ; i<array.length ; i++) {
			System.out.printf("array[%d] = %s\t", i, array[i]);
		}
		System.out.println();// 개행
		for(String arr : array) {
			System.out.print(arr + "\t");
		}
		System.out.println("\n ~ ~ ~ ~ ArrayList ~ ~ ~ ~");
		ArrayList<String> arrayList = new ArrayList<String>();
		// ArrayList<int> list = new ArrayList<int>(); ArrayList는 객체형 ArrayList만 가능
		arrayList.add("str0"); // 0번 인덱스
		arrayList.add("str1"); // 1번 인덱스
		System.out.println(arrayList);
	}
}

















