package sec01.exam04;

public class BeepPrintExample4 {
	public static void main(String[] args) {
		Thread thread = new BeepThread();
		//BeepThread 객체를 생성하는데 Thread(부모)의 타입이므로 부모에게서 상속받은 것만 사용 가능 -> run
		System.out.println("프로그램 시작 스레드 이름: "+ thread.getName());
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(600);
			} catch (Exception e) {
				
			}
		}
	}
}
