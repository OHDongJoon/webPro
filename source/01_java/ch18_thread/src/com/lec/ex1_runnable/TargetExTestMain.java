package com.lec.ex1_runnable;
public class TargetExTestMain {
	public static void main(String[] args) {
		Runnable target1 = new TargetEx01();
		Runnable target2 = new TargetEx02();
		//TargetEx02 target2 = new TargetEx02();
		// "A"라는 이름의 쓰레드 생성 - target1.run() 수행
		Thread threadA = new Thread(target1, "A");
		// "B"라는 이름의 쓰레드 생성 - target2.run() 수행
		Thread threadB = new Thread(target2, "B");
		threadA.start();
		threadB.start();
		for(int i=0 ; i<10 ; i++) {
			System.out.println("★ 나는 " + Thread.currentThread().getName() + i);
			// Thread.currentThread().getName() : 현재 쓰레드 이름
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) { }
		}
	}
}
