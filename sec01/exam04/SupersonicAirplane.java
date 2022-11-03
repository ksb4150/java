package sec01.exam04;

public class SupersonicAirplane extends Airplane {
	public static final int NORMAL = 1; // final이기 때문에 값을 바꿀 수 없음
	public static final int SUPERSONIC = 2; // 상수임
	
	public int flyMode = NORMAL; // 값을 외부에서 바꿀 수 있음
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		} else {
			//Airplane 객체(부모)의 fly() 메소드 호출
			super.fly();
		}
	}
}
