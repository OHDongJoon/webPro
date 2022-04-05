package com.lec.ex1_inputstreamOutputstream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
// (1)��Ʈ����ü(�Է¿�, ��¿�) (2)�а� ���� (3)���ϴݴ´�(��Ʈ����ü.close)
public class Ex05_filecopyStep3 {
	public static void main(String[] args) {
		InputStream  is = null;
		OutputStream os = null;
		try {
			File file = new File("d:\\webPro\\bts.jpg");
			is = new FileInputStream(file); // (1)
			os = new FileOutputStream("d:/webPro/bts_copyed.jpg");
			int cnt = 0;
			byte[] bs = new byte[(int)file.length()]; 
			while(true) { // (2)
				int readByteCount = is.read(bs); // ������ ũ�⸸ŭ byte�б�
				if(readByteCount == -1) break; // ������ ������ ����
				os.write(bs, 0, readByteCount);//bs�� 0��index���� readBytecount��ŭ ����
				cnt++;
			}
			System.out.println(cnt + "�� while�� �����Ͽ� ����� ���� ����");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(os!=null) os.close();
				if(is!=null) is.close();
			} catch (IOException e) {
				// TODO: handle exception
			}
		}//try-catch-finally
	}//main
}











