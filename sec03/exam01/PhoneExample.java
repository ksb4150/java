package sec03.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		//Phone phone = new Phone();
		// abstract는 new 생성자로 객체 생성이 안됨. -> 추상 클래스 자체의 객체를 생성할 수 없음
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		// 받아야할 값이 있을 때는 자동 생성자 x
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();

	}

}