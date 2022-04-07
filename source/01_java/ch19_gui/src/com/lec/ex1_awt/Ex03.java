package com.lec.ex1_awt;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Ex03 extends Frame {
	private Panel     panel;
	private TextField txtField;
	private Button    btnOk, btnExit;
	private List      list;
	public Ex03() {// layout셋팅, 컴포넌트 생성 후 add, setVisible, setSize
		//setLayout(new BorderLayout()); Frame 기본 레이아웃이므로 생략 가능
		panel = new Panel();
		// panel = new Panel(new FlowLayout()); panel 기본 레이아웃 
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
		// x 클릭시 종료 
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				setVisible(false); // 안보이게
				dispose();         // 자원 해제
				System.exit(0);    // 강제 종료
			}
		});
	}
	public Ex03(String title) {
		this();
		setTitle(title);
	}
}








