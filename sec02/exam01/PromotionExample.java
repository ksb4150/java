package sec02.exam01;

public class PromotionExample {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b; // a1은 A의 것만 사용할 수 있음
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
		//B b3 = e; B와 E는 상속관계가 아니기 때문에 에러
		//C c2 = d;
		//B b4 = c; B와 C는 상속관계가 아니기 때문에 에러
		
		System.out.println(b.a); //b는 a를 상속받음
		System.out.println(b.b);
		System.out.println(a1.a); 
//		System.out.println(a1.b); a1은 부모 클래스로 형변환 됨.
		System.out.println(d.a);
		System.out.println(d.d);
		System.out.println(b1.a);
		System.out.println(b1.b);
//		System.out.println(b1.d);
		

	}

}
