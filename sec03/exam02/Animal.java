package sec03.exam02;

public abstract class Animal {
	//메소드가 abstract이기 때문에 클래스 abstract 
	
	public String kind="동물";
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	
	public abstract void sound();
}
