package com.lec.ex4_threadNObjectN;
// ThreadEx threadA = new ThreadEx("A")
public class ThreadEx extends Thread{
	private int num = 0;
	public ThreadEx(String name) {
		super(name);
	}
	@Override
	public void run() {
		for(int i = 0 ; i <10 ; i++) {
			if(Thread.currentThread().getName().equals("A")) {
				System.out.println("~ ~ A ������ ���� �� ~ ~");
				num++;
			}
			System.out.println(Thread.currentThread().getName()+"�� num = "+num);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) { }
		}//for
	}
	public int getNum() {
		return num;
	}
}






