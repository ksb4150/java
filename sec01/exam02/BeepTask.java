package sec01.exam02;

import java.awt.Toolkit;

public class BeepTask implements Runnable {
	//Runnable은 인터페이스로 run이란 하나의 메소드만이 존재한다
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<5; i++) {
			toolkit.beep();
			System.out.println("동");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}
	}
}
