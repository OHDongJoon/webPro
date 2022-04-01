package com.lec.ex5_scanner;
import java.util.Scanner;
public class Ex01_nextLine {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ?");
		int age = scanner.nextInt();
		System.out.println("입력하신 나이는 "+age);
		
		System.out.print("이름을 입력하세요 ?");
		String name = scanner.next(); // whitespace앞까지 값만 return
		System.out.println("입력하신 이름은 "+name);
		
		System.out.print("주소를 입력하세요?");
		String address = scanner.nextLine(); // '\n' 앞에 있는 값을 return하고 
	}
}
