package com.lec.ex1_awt;
import java.awt.*;
public class Ex01MyFrame extends Frame {
	private Button btn;
	private Button btn1;
	public Ex01MyFrame(String title) {
		super(title); 
		// ��ư 2���� �߰��� ������
		btn = new Button("��ư");
		btn1 = new Button("�׳� ��ư");
		add(btn, BorderLayout.NORTH);
		add(btn1, BorderLayout.CENTER);
		//pack(); // �ּ����� �������
		setSize(new Dimension(300, 200));
		setVisible(true);
		setLocation(2000,50);
		
		// 3���� �ڵ� â�ݰ� ��������
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
		setVisible(false); // ȭ�鿡 �� ���̰�
		dispose(); // �ڿ�����
		System.exit(0);  // ���� ����
	}
	public static void main(String[] args) {
		new Ex01MyFrame("first GUI");
	}
}
















