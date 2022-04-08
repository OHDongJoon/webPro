package com.lec.ex2_swing;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
public class Ex03_GUI extends JFrame implements ActionListener {
	// ������Ʈ ��ü ���� ����(, ArrayList����, file io�� ���� stream, db ���Ӱ��� ����)
	private Container  contenPane; // �����̳� ���� ����
	private JPanel     jp; // �̸�,��ȭ,���� ���� 6�� ������Ʈ�� gridLayout���� add
	private JTextField txtName, txtTel, txtAge;
	private ImageIcon  icon;
	private JButton    btnOut;
	private JTextArea  jta;
	private JScrollPane scroolbar;
	private int        cnt; // ��� �Է��ߴ��� ����
	// ������ : �����̳� ���ͼ� -> layoutSetting -> ������Ʈ ��ü ���� �ؼ� add -> �̺�Ʈ �߰�
	public Ex03_GUI(String title) {
		super(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contenPane = getContentPane();
		// contenPane.setLayout(new BorderLayout()); �⺻ ���̾ƿ� �״�� ����ؼ� ����
		jp         = new JPanel(new GridLayout(3,2));
		//jp       = new JPanel();
		//jp.setLayout(new GridLayout(3,2)); // �г��� �⺻ ���̾ƿ��� FlowLayout()
		txtName    = new JTextField();
		txtTel     = new JTextField();
		txtAge     = new JTextField();
		icon       = new ImageIcon("icon/output.png");
		btnOut     = new JButton("���", icon);
		jta        = new JTextArea(5, 30); // 5�� 30�� textArea
		scroolbar  = new JScrollPane(jta);
		jp.add(new JLabel("��   ��", (int) CENTER_ALIGNMENT));
		jp.add(txtName);
		jp.add(new JLabel("��   ȭ", (int) CENTER_ALIGNMENT));
		jp.add(txtTel);
		jp.add(new JLabel("��   ��", (int) CENTER_ALIGNMENT));
		jp.add(txtAge);
		contenPane.add(jp, BorderLayout.NORTH);
		contenPane.add(btnOut, BorderLayout.CENTER);
		contenPane.add(scroolbar, BorderLayout.SOUTH);
		setVisible(true);
//		setSize(new Dimension(400, 280));
//		setLocation(2000, 100);
		setBounds(2000, 100, 400, 280);
		// �̺�Ʈ �߰�
		btnOut.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {// �̺�Ʈ ����
		if(e.getSource() == btnOut) {
			// txtName, txtTel, txtAge �� �Էµ� ���� jta�� ���
			String name = txtName.getText().trim();
			String tel  = txtTel.getText().trim();
			if(name.equals("") || tel.equals("")) {
				System.out.println("�̸��� ��ȭ��ȣ�� �ʼ� �Է� �����Դϴ�");
				return;
			}                                              // 031-789-7897
			if(tel.indexOf("-") == tel.lastIndexOf("-") || // 02-789-7897  02-1234-5689 010-9999-9999 011-325-8989
					tel.indexOf("-")<2 ||
					tel.lastIndexOf("-")>10) { // 000-12345(X)  123456789(X)   02-123-4567(X)    010-912345999-9999
				System.out.println("��ȭ��ȣ ������ Ȯ���� �ּ���");
				return;
			}
			// ���� üũ
		}
	}
	public static void main(String[] args) {
		new Ex03_GUI("last EX");
	}
}
















