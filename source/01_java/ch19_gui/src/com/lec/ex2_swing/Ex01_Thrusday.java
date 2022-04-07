package com.lec.ex2_swing;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Ex01_Thrusday extends JFrame implements ActionListener{
	private JPanel panel; // �޾ƿ� �����̳ʸ� ����
	// private Container contenPane; // �޾ƿ� �����̳ʸ� ����
	private JLabel jlbl;
	private JButton jbtn;	
	public Ex01_Thrusday(String title) { // �����̳� �޾ƿͼ� ������Ʈ add
		super(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // x��ư Ŭ���� ����
		//������ �����̳� ������(��ó��)
		panel = (JPanel) getContentPane(); 
		panel.setLayout(new FlowLayout());
		jlbl = new JLabel("��ſ� �����", (int)CENTER_ALIGNMENT);  
		jbtn = new JButton("EXIT");
		
		add(jlbl);
		jlbl.setPreferredSize(new Dimension(150, 200));
		add(jbtn);
		jbtn.setPreferredSize(new Dimension(200, 200));
		setVisible(true);
		setSize(new Dimension(400, 250));
		setLocation(2000, 50);
		// �̺�Ʈ ������ �߰�
		jbtn.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) { // �̺�Ʈ ����
		if(e.getSource() == jbtn) {
			setVisible(false);
			dispose();
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		new Ex01_Thrusday("title");
	}
}








