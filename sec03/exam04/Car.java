package sec03.exam04;

public class Car { 
	
	String company = "현대자동차"; // 명시적 초기화
	String model; // 기본값 넣어지고 생성자로 초기화
	String color;
	int maxSpeed;
	
	Car() {
		
	}
	
	Car(String model) {
		this(model, null, 0); // 생성자의 첫번째 줄에 작성해야 함
	  //this()는 다른 생성자 호출 -> 23번째 줄
	}
	
	Car(String model, String color) {
		this(model, color, 0);
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
}
