package com.lec.ex4_threadNObjectN;
// ThreadEx threadA = new ThreadEx("A")
public class ThreadEx extends Thread{
	private int num = 0;
	public ThreadEx(String name) {
		super(name);
	}
	@Override
	public synchronized void run() {
		for(int i=0 ; i<10 ; i++) {
			out();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) { }
		}//for
	}
	private void out() {
		if(Thread.currentThread().getName().equals("A")) {// "A"�������� ���
			System.out.println("~ ~ ~ A ������ ������ ~ ~ ~");
			num++;
		}
		System.out.println(Thread.currentThread().getName() +"�� num = " + num);
	}
	public int getNum() {
		return num;
	}
}






