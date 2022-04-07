package com.lec.ex1_awt;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Ex03 extends Frame {
	private Panel     panel;
	private TextField txtField;
	private Button    btnOk, btnExit;
	private List      list;
	public Ex03() {// layout����, ������Ʈ ���� �� add, setVisible, setSize
		//setLayout(new BorderLayout()); Frame �⺻ ���̾ƿ��̹Ƿ� ���� ����
		panel = new Panel();
		// panel = new Panel(new FlowLayout()); panel �⺻ ���̾ƿ� 
		txtField = new TextField(20);
		btnOk    = new Button("OK");
		btnExit  = new Button("EXIT");
		list     = new List();
		panel.add(new Label("write"));
		panel.add(txtField);
		panel.add(btnOk);
		panel.add(btnExit);
		add(panel, BorderLayout.NORTH);
		add(list, BorderLayout.CENTER);
		setVisible(true);
		setSize(new Dimension(400, 150));
		setLocation(2000, 50);
		// x Ŭ���� ���� 
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				setVisible(false); // �Ⱥ��̰�
				dispose();         // �ڿ� ����
				System.exit(0);    // ���� ����
			}
		});
	}
	public Ex03(String title) {
		this();
		setTitle(title);
	}
}








