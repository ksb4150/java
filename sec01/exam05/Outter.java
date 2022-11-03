package sec01.exam05;

public class Outter {
	String field = "Outter-field";
	void method() {
		System.out.println("Outter-method");
	}
	
	class Nested {
		String field = "Nested-field";
		
		void method() {
			System.out.println("Nested-method");
		}
		
		void print() {
			System.out.println(this.field); 
			this.method();
			System.out.println(Outter.this.field);
			Outter.this.method();
			//같은 내부에 있기 때문에 Outter를 객체 생성해서 부르지 않고 클래스 이름으로 부름
		}
	}
}
