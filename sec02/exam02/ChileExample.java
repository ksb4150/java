package sec02.exam02;

public class ChileExample {

	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		
		Parent parent2 = new Parent();
		
		System.out.println("형변환된 parent");
		
		parent.method1();
		
		parent.method2(); //부모형으로 타입 변환됐지만 부모는 오버라이딩 된 메소드를 가져옴

		//parent.method3(); (호출 불가능)
		
		System.out.println("자식 클래스타입 child");
		
		child.method1();
		
		child.method2();
		child.method3();
		
		System.out.println("부모 클래스타입 parent2");
		
		parent2.method1();
		parent2.method2();
	}

}
