package com.lec.ex3_threadNObject1;
public class TargetEx implements Runnable {
	private int num = 0 ;
	@Override
	public void run() {
		for(int i=0 ; i<10 ; i++) {
			out();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) { }
		}//for
	}//run()
	private synchronized void out() {
		if(Thread.currentThread().getName().equals("A")) {// "A"�������� ���
			System.out.println("~ ~ ~ A ������ ������ ~ ~ ~");
			num++;
		}
		System.out.println(Thread.currentThread().getName() +"�� num = " + num);
	}
}//class
