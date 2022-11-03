package sec03.exam02;

public class AnimalExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("--------");
		
		//변수의 자동 타입 변환
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("---------");
		
		//매개변수의 자동 타입 변환
		animalSound(new Dog());
		animalSound(new Cat());
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}

//this 써서 부모 클래스로 가는지 찾아보기, super()한 거 찾아보기
//null 한 다음에 new 연산자 해서 객체 넣은거 찾아보기 혼공자바 0에 있을듯