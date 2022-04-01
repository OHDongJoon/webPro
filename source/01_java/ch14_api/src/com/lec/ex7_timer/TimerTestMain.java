package com.lec.ex7_timer;
import java.util.Timer;
import java.util.TimerTask;
public class TimerTestMain {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("시작");
		Timer timer = new Timer(true); // 프로그램이 끝나도 계속 timer상주
		TimerTask task1 = new TimerTaskEx1();
		TimerTask task2 = new TimerTaskEx2();
		timer.schedule(task1, 2000); // 2초후에 task1수행
		// 3초동안 잠깐 멈춤 
		Thread.sleep(3000);
		System.out.println("끝");
	}
}
