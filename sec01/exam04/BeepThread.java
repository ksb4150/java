package sec01.exam04;

import java.awt.Toolkit;

public class BeepThread extends Thread {
	//Thread는 이미 Runnable을 상속받고 있기 때문에 run 메소드를 바로 override할 수 있음
		@Override
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
