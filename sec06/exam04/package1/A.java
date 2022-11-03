package sec06.exam04.package1;

public class A {
	A a1 = new A(true); // 어디서나 당당하게 가능
	A a2 = new A(1); // 같은 패키지이기 대문에 가능
	A a3 = new A("문자열"); // 같은 내부이기 때문에 가능
	
	public A(boolean b) {}
	A(int b) {}
	private A(String s) {}
}
