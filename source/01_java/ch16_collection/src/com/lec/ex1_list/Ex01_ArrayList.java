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
		System.out.println();// ����
		for(String arr : array) {
			System.out.print(arr + "\t");
		}
		System.out.println("\n ~ ~ ~ ~ ArrayList ~ ~ ~ ~");
		ArrayList<String> arrayList = new ArrayList<String>();
		// ArrayList<int> list = new ArrayList<int>(); ArrayList�� ��ü�� ArrayList�� ����
		arrayList.add("str0"); // 0�� �ε���
		arrayList.add("str1"); // 1�� �ε���
		System.out.println(arrayList);
	}
}

















