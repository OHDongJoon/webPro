package com.lec.ex4_printWriter;
import java.io.*;
public class Ex {
	public static void main(String[] args) {
		OutputStream os = null;
		Writer      writer = null;
		PrintWriter printWriter = null;
		try {
//			os = new FileOutputStream("txtFile/outTest.txt", true); // �⺻ ��Ʈ��
//			printWriter = new PrintWriter(os);  // ������Ʈ��
//			writer = new FileWriter("txtFile/outTest.txt", true); // �⺻��Ʈ��
//			printWriter = new PrintWriter(writer); // ������Ʈ��
			printWriter = new PrintWriter("txtFile/outTest.txt"); // ���� append �Ұ�
			System.out.println("�ȳ��ϼ���\n�ݰ����ϴ�");
			printWriter.println("�ȳ��ϼ���\n�ݰ����ϴ�");
			
			System.out.print("print�� �ڵ������� �ȵǼ� �����߰�\n");
			printWriter.print("print�� �ڵ������� �ȵǼ� �����߰�\n");
			
			System.out.printf("%s \t %3d \t %3d \t %5.1f\n", "ȫ�浿", 90, 91, 90.5);
			printWriter.printf("%s \t %3d \t %3d \t %5.1f\n", "ȫ�浿", 90, 91, 90.5);
			
			System.out.printf("%s \t %3d \t %3d \t %5.1f\n", "�ű浿", 100, 100, 100.0);
			printWriter.printf("%s \t %3d \t %3d \t %5.1f\n", "�ű浿", 100, 100, 100.0);
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if(printWriter!=null) printWriter.close();
		}
	}
}












