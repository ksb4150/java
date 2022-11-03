package sec02.exam05;

public class ChildExample {

	public static void main(String[] args) {
		// Parent 타입의 변수에 Child 객체를 넣어준 것이다.
		// 객체는 Child형이지만 Parent 타입 변수에 넣어줬으므로 Parent 멤버와 재정의 된 메소드까지 밖에 사용할 수 없다.
		// Child 멤버들 비활성화
		Parent parent = new Child();
		
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
	  /* 
	     parent.field2 = "data2"; child의 멤버
		 parent.method3(); child의 재정의 된 메소드가 아닌 멤버
	  */

		// 옳은 방법은 아님 -> 옳은 방법 sec02.exam06에 있음
		// 원래 Child 객체였던 것을 원래대로 되돌려 놓는 것이기 때문에 가능
		Child child = (Child) parent;
		child.field2 = "yyy";
		child.method3();
		
	}

}
