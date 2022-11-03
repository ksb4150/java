package sec02.exam01;

public class CarTwo {
	Tire frontLeftTire = new HankookTire();
	//상위 타입의 매개변수에 객체를 넣었기 때문에 다형성이 가능
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	//같은 HankookTire 객체이지만 전혀 다른 주소를 가진 다른 객체임

	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}