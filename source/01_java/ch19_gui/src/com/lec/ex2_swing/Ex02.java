package com.lec.ex2_swing;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.*;
public class Ex02 extends JFrame implements ActionListener {
	// �ʿ��� ������Ʈ ���� �߰�
	//private JPanel   jpanel;     // �����̳� ���� ����
	private Container  contenPane; // �����̳� ���� ����
	private ImageIcon  icon;       // ��ư�� �� icon
	private JButton    jBtn; 
	private JTextField jtxtField; 
	private Vector<String> items;  // �ĺ��ڽ��� �� item����Ʈ (item�� �������϶��� Vector, �������� �� String�迭)
	private String[] item = {"A", "B", "C"};
	private JComboBox<String> jCombo;
	private JCheckBox         jCheck;
	private JLabel            jlBlank; // �� ��
	private JButton           jtxtExit;
	
	// ������ : �����̳� ���ͼ� layout ���� -> ������Ʈ ���� �� add -> setVisible, setSize (ȭ�鱸��) -> �̺�Ʈ �߰�
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		new Ex02(); // ����
	}
}
