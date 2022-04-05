package com.lec.ex2_datastream;
import java.io.*;
import java.util.ArrayList;
// ���Ͽ� ����� ������ ���
public class Ex04_ProductPrint {
	public static void main(String[] args) {
		InputStream     fis = null;
		DataInputStream dis = null;
		ArrayList<Product> products = new ArrayList<Product>();
		try {
			fis = new FileInputStream("src/com/lec/ex2_datastream/product.dat");
			dis = new DataInputStream(fis);
			while(true) {
				String name  = dis.readUTF(); // ��ǰ��
				int    price = dis.readInt(); // ����
				int    ps    = dis.readInt(); // ���
				products.add(new Product(name, price, ps));
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println("��� �����ʹ� ������ �����ϴ�");
		} finally {
			try {
				if(dis!=null) dis.close();
				if(fis!=null) fis.close();
			} catch (Exception e2) {}
		} // try-catch
		// ArrayList products ���
		if(products.isEmpty()) {
			System.out.println("�Էµ� ����� �����ϴ�");
		}else {
			for(Product product :products) {
				System.out.println(product);
			}
			System.out.println("�̻� ��ǰ " + products.size() +"���� �Էµ�");
		}
	}
}













