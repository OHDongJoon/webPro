package com.lec.ex2_datastream;
import java.io.*;
public class Ex02_dataInputStream {
	public static void main(String[] args) {
		InputStream     fis = null;
		DataInputStream dis = null;
		try {
			fis = new FileInputStream("txtFile/dataFile.dat");
			dis = new DataInputStream(fis); // ������Ʈ���� �⺻��Ʈ���� ���ؼ� ����
			while(true) {
				String name = dis.readUTF();
				int grade   = dis.readInt();
				double score = dis.readDouble();
				System.out.printf("%s�� %d�г� %f��\n", 
						name, grade, score);
			}
		} catch (FileNotFoundException e) {
			System.out.println("���� �� ã�� : " + e.getMessage());
		} catch (IOException e) {
			System.out.println("�̻� ������ ��");
		}finally {
			try {
				if(dis!=null) dis.close();
				if(fis!=null) fis.close();
			} catch (IOException e2) { }
		}
	}
}
