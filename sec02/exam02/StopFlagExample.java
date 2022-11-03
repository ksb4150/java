package sec02.exam02;

public class StopFlagExample {
	public static void main(String[] args) {
		PrintThread1 printThread = new PrintThread1();
		printThread.start(); // 이후 run 메소드 안의 while 반복
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
		
		printThread.setStop(true); // 이후 객체의 stop flag를 바꿔 종료
	}
}
