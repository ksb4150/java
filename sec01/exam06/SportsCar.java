package sec01.exam06;

public class SportsCar extends Car{
	@Override
	public void speedUp() {
		speed += 10;
		System.out.println("현재 속도 : "+speed);
	}
	
	//오버라이딩을 할 수 없음
	/*
	 @Override
	 public void stop() {
	 	System.out.println("스포츠카를 멈춤");
	 	speed = 0;
	 }
	 */
}
