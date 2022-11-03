package sec02.exam06;

public class InstanceofExample {

	public static void method1(Parent parent) {
		if(parent instanceof Child) { // parent 매개 변수가 참조하는 객체가 Child인지 조사
			Child child = (Child) parent;
			System.out.println("method1 = Child로 변환 성공");
		} else {
			System.out.println("method1 = Child로 변환되지 않음");
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent; // parentB는 원래 Parent 객체이기 때문에 예외 발생
		// parentA가 원래 Child 객체이기 때문에 method1(parentB)가 가능
		System.out.println("method2 - Child로 변환 성공");
	}
	
	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA); // 같은 클래스 안에 있으며 static 메서드 이기 때문에 이러한 방식으로 사용 가능
		method2(parentA);
		
		Parent parentB = new Parent();
		method1(parentB);
		method2(parentB); 
		
		/*
		 parentA, parent, metho1의 child 모두 같은 객체를 가리킴. 
		  */
	}

}