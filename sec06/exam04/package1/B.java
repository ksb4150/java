package sec06.exam04.package1;

public class B { // extends A는 되지 않음. A에 기본 생성자가 없기 때문
	
	A a1 = new A(true); // public이라 어디서든 가능하다
	A a2 = new A(1);  // default라 같은 패키지 내에서는 가능하다
	//A a3 = new A("문자열") private라서 불가능하다.
}
