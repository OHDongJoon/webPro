package com.lec.ex3_quiz;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class MyFrame extends JFrame implements ActionListener {
	// ������Ʈ ��ü ���� ����(, ArrayList����, file io�� ���� stream, db ���Ӱ��� ����)
	private Container contenPane; // �����̳ʸ� �޾ƿ� ����
	private JPanel    jpUp, jpDown;      
	private JTextField txtName, txtTel, txtAge;
	private JButton btnJoin, btnFileOut;
	private ArrayList<Person> person;
	//private OutputStream os; 
	public MyFrame(String title) {
		super(title);
		person = new ArrayList<Person>();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contenPane = getContentPane();
		jpUp = new JPanel(new GridLayout(3, 2));
		jpDown = new JPanel(new FlowLayout());
		txtName = new JTextField();
		txtTel  = new JTextField();
		txtAge  = new JTextField();
		ImageIcon iconJoin = new ImageIcon("icon/join.png");
		btnJoin = new JButton("����",iconJoin);
		ImageIcon iconFileOut = new ImageIcon("icon/output.png");
		btnFileOut = new JButton("���",iconFileOut);
		jpUp.add(new JLabel("�̸�", (int) CENTER_ALIGNMENT));
		jpUp.add(txtName);
		jpUp.add(new JLabel("��ȭ", (int) CENTER_ALIGNMENT));
		jpUp.add(txtTel);
		jpUp.add(new JLabel("����", (int) CENTER_ALIGNMENT));
		jpUp.add(txtAge);
		jpDown.add(btnJoin); 
		jpDown.add(btnFileOut);
		contenPane.add(jpUp, BorderLayout.CENTER);
		contenPane.add(jpDown, BorderLayout.SOUTH);
		setBounds(2000, 100, 300, 200);
		setVisible(true);
		// �̺�Ʈ �߰�
		btnJoin.addActionListener(this);
		btnFileOut.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnJoin) {
			String name, tel; int age;
			name = txtName.getText().trim();
			tel  = txtTel.getText().trim();
			try {
				age = Integer.parseInt(txtAge.getText());
			} catch (Exception e2) {
				age = -1;
			}
			if(!name.equals("") && !tel.equals("") && age !=-1) {
				person.add(new Person(name, tel, age));
				txtName.setText("");
				txtTel.setText("");
				txtAge.setText("");
			}else {
				System.out.println("��ȿ���� �ʴ� ���Դϴ�");
			}
		}else if(e.getSource()==btnFileOut) {
			// 1byte�� ����ϴ� OutputStream�̿�
			OutputStream os = null;
			try {
				os = new FileOutputStream("src/com/lec/ex3_quiz/person1byte.txt", true);
				for(Person p : person) {
					System.out.println(p);
					os.write((p.toString()+"\n").getBytes());
				}
			} catch (IOException e1) {
				System.out.println(e1.getMessage());
			}finally {
				try {
					if(os!=null) os.close();
				}catch (Exception e1) { }
			}// try-catch
			//2byte�� ����ϴ� Writer�̿�
			Writer writer=null;
			try {
				writer = new FileWriter("src/com/lec/ex3_quiz/person2byte.txt",true);
				for(Person p : person) {
					writer.write(p.toString()+"\n");
				}
			} catch (IOException e1) {
				System.out.println(e1.getMessage());
			}finally {
				try {
					if(writer!=null) writer.close();
				}catch (Exception e1) { }
			}// try-catch
			// 3. printWriter�̿��ϴ� ���
			writer =null;
			PrintWriter printWriter = null;
			try {
				writer = new FileWriter("src/com/lec/ex3_quiz/personPrintWriter.txt",true);
				printWriter = new PrintWriter(writer);
				for(Person p : person) {
					printWriter.println(p.toString());
				}
			} catch (IOException e1) {
				System.out.println(e1.getMessage());
			}finally {
				try {
					if(printWriter!=null) printWriter.close();
					if(writer!=null) writer.close();
				}catch (Exception e1) { }
			}// try-catch
		}
	}//actionPerformed
	public static void main(String[] args) {
		new MyFrame("GUI EX");
	}//main
}//class
