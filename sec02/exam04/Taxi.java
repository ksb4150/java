package sec02.exam04;

public class Taxi extends Vehicle{
	
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
	
	// public void n() 을 하면 이건 실행할 수 없음
}