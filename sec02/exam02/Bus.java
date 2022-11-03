package sec02.exam02;

public class Bus implements Vehicle {
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	
	public void test() {
		System.out.println("다형서 테스트 메소드");
	}
}
