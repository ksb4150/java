package sec01.exam04;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		// new 연산자기 sa에 대입연산자를 통해 객체의 주소를 넣음
		SupersonicAirplane sa = new SupersonicAirplane();
		
		sa.takeOff();
		sa.fly(); // 부모 객체 fly
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly(); // 자식 객체 fly
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly(); // 부모 객체 fly
		sa.land();

	}

}
