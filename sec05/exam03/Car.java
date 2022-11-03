package sec05.exam03;

public class Car {

	int speed;
	static int minSpeed = 0;
	
	static void t() {
		
	}
	
	void run() {
		minSpeed=0;
		t();
		System.out.println(speed+"으로 달립니다.");
	}
	public static void main(String[] args) { 
		//main 메서드가 static이기 때문에 같은 클래스 안에 있어도 객체 생성 후
		//접근 연산자 사용해서 사용해야 한다.
		//this.speed = 10;
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();

	}

}
