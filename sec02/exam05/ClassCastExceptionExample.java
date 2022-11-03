package sec02.exam05;

public class ClassCastExceptionExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
	}
	
	//Cat이 들어가도 Animal 타입으로 받기 때문에 에러가 걸리지 않음
	public static void changeDog(Animal animal) {
		if(animal instanceof Dog) {
			Dog dog = (Dog) animal;
		}
	}
	
	/*
	  	public static void changeDog(Animal animal) {
		if(animal instanceof Dog) {
			Cat cat = (Cat) animal;
		}
	}
	  */
}

class Animal{}
class Dog extends Animal {}
class Cat extends Animal{}