package sec01.exam06;

public class ThreadB extends Thread {
	// 스레드 이름은 선언X
	// default 값이 들어감
	@Override 
	public void run() {
		for(int i=0; i<2; i++) {
			System.out.println(getName() +"가 출력한 내용");
		}
	}
}
