package com.lec.ex2_datastream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;
public class Ex03_ProductWrier { // n�� �Է��Ҷ����� ���(��ǰ��, ����, ���)�� �Է¹޾� ���� ���
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		String answer;
		OutputStream     fos = null;
		DataOutputStream dos = null;
		try {
			fos = new FileOutputStream("src/com/lec/ex2_datastream/product.dat", true);
			dos = new DataOutputStream(fos);
			while(true) {
				System.out.print("�Է��� ��� �� �ֳ���(Y/N)?");
				answer = sc.next();
				if(answer.equalsIgnoreCase("n")) {
					break;
				}else if(answer.equalsIgnoreCase("y")) { // ��ǰ��, ����, ����� ���Ϸ� ���
					System.out.print("��ǰ���� ?");
					dos.writeUTF(sc.next());
					System.out.print("������ ?");
					dos.writeInt(sc.nextInt());
					System.out.print("�������� ?");
					dos.writeInt(sc.nextInt());
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(dos!=null) dos.close();
				if(fos!=null) fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}// try-catch-finally
	}// main
}














