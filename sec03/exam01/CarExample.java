package sec03.exam01;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car("검정", 3000);
		// Car myCar = new Car(); 
		// 프로그래머가 생성자를 생성하지 않으면 자바가 기본 생성자를 만듬.
		// 프로그래머가 기본 생성자가 아닌 생성자를 선언한 이후부터
		// 기본 생성자를 사용하기 위해서는 프로그래머가 직접 선언해줘야함.
		
		Car myCar2 = new Car();
	
		Car myCar3 = new Car("검정", 2002.2);
	}

}
