package sec02.exam01;

public class CarTwoExample {

	public static void main(String[] args) {
		CarTwo myCar = new CarTwo();
		
		myCar.run();
		
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		
		System.out.println("-------------");
		
		myCar.run();

	}
	//혼공자바_2 p68
}
