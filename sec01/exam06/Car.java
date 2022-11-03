package sec01.exam06;

public class Car {
	//필드
	public int speed;
	
	//메소드
	public void speedUp() {
		speed += 1;
		System.out.println("현재 속도 : "+speed);
	}
	
	//final 메소드는 자식 객체가 사용할 수 있지만 재정의(override)를 할 수 없음
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
		System.out.println("현재 속도 : "+speed);
	}
}
