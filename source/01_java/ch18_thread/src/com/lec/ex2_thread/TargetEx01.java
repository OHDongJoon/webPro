package com.lec.ex2_thread;
// Thread t1 = new Thread(target1, "A");
// Thread t1 = new ThreadEx01("A");
// Thread t1 = new ThreadEx01();
public class TargetEx01 extends Thread {
	public TargetEx01() {}
	public TargetEx01(String name) {
		super(name);
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(int i=0 ; i<10 ; i++) {
			System.out.println("�ȳ��ϼ��� - " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) { } // ���� �۾��� 0.5�ʵ��� �����·�
		}
	}
}
