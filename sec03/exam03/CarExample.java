package sec03.exam03;

public class CarExample {

	public static void main(String[] args) {
		// main 메서드가 있으므로 활용 클래스
		Car car1 = new Car();
		System.out.println("car1.company : "+car1.company);
		System.out.println();
		
		Car car2 = new Car("자가용");
		System.out.println("car2.company : "+car2.company);
		System.out.println("car2.model : "+car2.model);
		System.out.println();
		
		Car car3 = new Car("자가용", "빨강");
		System.out.println("car3.company : "+car3.company);
		System.out.println("car3.model : "+car3.model);
		System.out.println("car3.color : "+car3.color);
		System.out.println();
		
		Car car5 = new Car("기아자동차", "자가용", "빨강", 200);
		System.out.println("car5.company : "+car5.company);
		// 앞의 객체와 다른 객체의 필드(company)가 초기화되므로 영향 X
		
		Car car4 = new Car("자가용", "빨강", 200);
		System.out.println("car4.company : "+car4.company);
		System.out.println("car4.model : "+car4.model);
		System.out.println("car4.color : "+car4.color);
		System.out.println("car4.maxSpeed : "+car4.maxSpeed);
		System.out.println();
	
	}

}
