package com.lec.ex1_inputstreamOutputstream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
// (1) ������ ����(�Է¿� ��Ʈ����ü����) (2)�����͸� �д´�(read()) (3)������ �ݴ´�
public class Ex01_InputStream {
	public static void main(String[] args) {
		InputStream is = null; 
		try {
			is = new FileInputStream("txtFile/inTest.txt"); // 1. ������ ����
			while(true) { // 2. �����͸� �д´�
				int i = is.read(); // 1byte�� �б�
				if(i==-1) break;   // ������ ���̸� �ݺ��� break
				System.out.print((char)i + "(" + i +")");
			}
			System.out.println("\n��");
		} catch (FileNotFoundException e) {
			System.out.println("������ �� ã�� ��� ���� : "+e.getMessage());
		} catch (IOException e) {
			System.out.println("������ �� �д� ��� ���� : " +e.getMessage());
		} finally {
			try {// 3. ������ �ݴ´�
				if(is!=null) is.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}





