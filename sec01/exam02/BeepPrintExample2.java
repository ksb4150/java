package sec01.exam02;

public class BeepPrintExample2 {
	public static void main(String[] args) {
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start(); //BeepTask의 run()을 실행시키고 내려옴 -> 작업 스레드 실행됨
		
		// 동시에 for문 실행 -> 메인 스레드 실행 (사실은 병행 처리)
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}
	}
}