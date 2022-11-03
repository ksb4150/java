package sec01.exam06;

public class ThreadA extends Thread {
	public ThreadA() {
		setName("ThreadA");
		//Thread에 있는 Name 필드를 ThreadA로 초기화
	}
	
	public void run() {
		for(int i=0; i<2; i++) {
			System.out.println(getName()+"가 출력한 내용");
		}
	}
}
