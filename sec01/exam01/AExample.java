package sec01.exam01;

public class AExample {
	public static void main(String[] args) {
		A a = new A();
		
		//인스턴스 멤버 클래스 객체 생성
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
		//정적 멤버 클래스 객체 생성
		A.C c = new A.C();
		//A.C c1 = a.new C(); 정적 클래스는 클래스의 이름으로 접근이 가능한데 이런식으로 접근하면 인스턴스 방법인듯
		//C클래스 안에 있는 인스턴스 멤버를 사용하기 위해 객체 생성을 해줌
		c.field1 = 3;
		c.method1();
		A.C.field2 = 3;
		A.C.method2();
		
		//로컬 클래스 객체 생성을 위한 메소드 호출
		a.method();
	}
}
