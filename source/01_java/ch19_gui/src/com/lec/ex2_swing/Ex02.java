package com.lec.ex2_swing;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.*;
public class Ex02 extends JFrame implements ActionListener {
	// 필요한 컴포넌트 변수 추가
	//private JPanel   jpanel;     // 컨테이너 얻어올 변수
	private Container  contenPane; // 컨테이너 얻어올 변수
	private ImageIcon  icon;       // 버튼에 들어갈 icon
	private JButton    jBtn; 
	private JTextField jtxtField; 
	private Vector<String> items;  // 컴보박스에 들어갈 item리스트 (item이 가변적일때는 Vector, 고정적일 때 String배열)
	private String[] item = {"A", "B", "C"};
	private JComboBox<String> jCombo;
	private JCheckBox         jCheck;
	private JLabel            jlBlank; // 빈 라벨
	private JButton           jtxtExit;
	
	// 생성자 : 컨테이너 얻어와서 layout 셋팅 -> 컴포넌트 생성 후 add -> setVisible, setSize (화면구현) -> 이벤트 추가
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		new Ex02(); // 실행
	}
}
