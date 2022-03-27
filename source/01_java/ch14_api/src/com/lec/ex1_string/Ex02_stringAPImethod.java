package com.lec.ex1_string;
public class Ex02_stringAPImethod {
	public static void main(String[] args) {
		String str1 = "abcXabc";
		String str2 = new String("ABCXabc");
		String str3 = "       ja    va       ";
		System.out.println("1."+str1.concat(str2)); // ���ڿ����� abcXabcABCXabc
		System.out.println("2."+str1.substring(3)); // 3��°���ͳ����� Xabc
		System.out.println("3."+str1.substring(3,5));//3��°���� 5��°�ձ��� Xa
		System.out.println("4."+str1.length());  //���ڱ��� 7
		System.out.println("5."+str1.toUpperCase()); // �빮�ڷ� ABCXABC
		System.out.println("6."+str1.toLowerCase()); // �ҹ��ڷ� abcxabc
		System.out.println("7."+str1.charAt(3)); // 3��° ���� 'X'
		System.out.println("8."+str1.indexOf('b')); // ù��° 'b'�� ������ �ε��� 1
		System.out.println("9."+str1.indexOf('b', 3)); // 3��°���Ͱ˻��ؼ� ù��° 'b' ��ġ5
		System.out.println("10."+str1.indexOf("abc")); // ù��° "abc"������ ��ġ 0
		System.out.println("11."+str1.indexOf("abc",3)); // 3��°���� �˻��ؼ� "abc"��ġ 4
		System.out.println("12."+str1.indexOf('z'));//������  -1
		System.out.println("13."+str1.lastIndexOf('b'));//������ 'b' ��ġ 5
		System.out.println("14."+str1.lastIndexOf('b',3));//3��°���� �� ������ b 1
		System.out.println("15."+str1.equals(str2)); // str1�� str2�� ���� ���ڿ����� false
		System.out.println("16."+str1.equalsIgnoreCase(str2));//��ҹ��ڱ��о��� �� true
		str1 = "abcXabc";
		str3 = "       ja    va       ";
		System.out.println("17."+str3.trim()); // �յ� ���� ���� ja   va
		System.out.println("18."+str1.replace('a', '9'));//'a'�� '9'�� ���� 9bcX9bc
		System.out.println("19."+str1.replace("abc", "��"));// "abc"�� "#"���� ���� #X#
		System.out.println("str3�� space�� ���ֱ� : "+str3.replace(" ", ""));
		System.out.println("20."+str1.replaceAll("abc","Z"));// "abc"�� "z"
		System.out.println("20."+str1.replace("abc", "Z"));// "abc"�� "z"
		/*����ǥ����  https://goo.gl/HLntbd
		 *       ������ : http://www.nextree.co.kr/p4327  */
		String str = "�ȳ�Hello"; // ������ �� *
		System.out.println(str.replaceAll("[a-zA-Z]", ""));//���ĺ��� ""�� ����
		System.out.println(str.replaceAll("[��-�R]", "")); // �ѱ۹��ڸ� ""�� ����
		// ���ڿ� �޼ҵ�� ���ڿ��� ���� ����
		System.out.println("str1 = "+str1);
		System.out.println("str2 = "+str2);
		System.out.println("str3 = "+str3);
		
	}
}














