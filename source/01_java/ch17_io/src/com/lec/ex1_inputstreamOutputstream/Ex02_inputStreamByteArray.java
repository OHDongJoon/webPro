package com.lec.ex1_inputstreamOutputstream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
// (1) ���� ���� 
// (2)�����͸� �д´� : read() 1byte�� �д´�. �ӵ��� ���� / read(byte[]) byte[]��ŭ �б�
// (3) ���� �ݴ´�
public class Ex02_inputStreamByteArray {
	public static void main(String[] args) {
		InputStream is = null;
		try {
			is = new FileInputStream("txtFile/inTest.txt"); // 1. ���Ͽ���
			byte[] bs = new byte[10];
			while(true) { // 2. ���� �д´�
				int readByteCount = is.read(bs); // 10 byte�� �б�
				if(readByteCount == -1) break; // ���� ������ ����
				for(int i=0 ; i<readByteCount ; i++) {
					System.out.print((char)bs[i]);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try { // 3.���ϴݴ´�
				if(is!=null) is.close();
			} catch (IOException e) {}
		}
	}
}






