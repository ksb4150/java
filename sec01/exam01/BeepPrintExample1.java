package sec01.exam01;

import java.awt.Toolkit;

public class BeepPrintExample1 {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();

		//첫 번째 for문 실행
		for(int i =0; i<5; i++) {
			toolkit.beep();
			try{
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}
		
		//첫 번째 for문 종료 후 두 번째 for문 실행 -> 순차 실행
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}
	}
}
