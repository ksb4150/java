package sec03.exam03;

public class Car { //오버로딩 -> 가중시키다
	//초기화 단계의 순서 : 명시적 초기화 , 기본값 적용, 생성자로 인한 초기화
	
	String company = "현대자동차"; // 명시적 초기화
	String model; // 기본값 넣어지고 생성자로 초기화
	String color;
	int maxSpeed;
	
	Car() {
		
	}
	
	Car(String model) {
		this.model = model;
	}
	
	Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	Car(String company, String model, String color, int maxSpeed) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
}
