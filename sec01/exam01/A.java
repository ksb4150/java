package sec01.exam01;

public class A {
	//바깥 클래스
	A() {
		System.out.println("A 객체가 생성됨");
	}
	
	//인스턴스 멤버 클래스
	class B {
		B() {
			System.out.println("B 객체가 생성됨");
		}
		
		int field1;
		//static int field2;
		void method1() {
			System.out.println("클래스 B-method1 실행");
		}
		//static void method2() {}
	}
	
	//정적 멤버 클래스, static 안에 인스턴스 멤버 선언 가능
	static class C {
		C() {
			System.out.println("C 객체가 생성됨");
		}
		
		int field1;
		static int field2;
		void method1() {
			System.out.println("클래스 C-method1 실행");
		}
		static void method2() {
			System.out.println("클래스 C-method2 실행");
		}
	}
	
	//로컬 클래스, 인스턴스 멤버 안에 static 선언 불가능
	void method() {
		class D {
			D() {
				System.out.println("D 객체가 생성됨");
			}
			
			int field1;
			//static int field2;
			void method1() {
				System.out.println("클래스 D-method1 실행");
			}
			//static void method2() {}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
