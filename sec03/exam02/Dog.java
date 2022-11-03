package sec03.exam02;

public class Dog extends Animal {
	public Dog() {
		this.kind = "포유류"; // 부모 객체의 kind이긴 하지만 논리적으로는 자식 객체의 kind이므로 this 해주기
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}