package sec03.exam01;

public abstract class Phone {
	// abstract는 자식을 통해서만 생성할 수 있음
	
	//필드
	public String owner;
	
	//생성자
	public Phone(String owner) {
		this.owner = owner;
	}
	
	//메소드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}


// 부모 형의 매개변수에 넣어줘야 가능하다