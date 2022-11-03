package sec02.exam05;

public class Example {
	public static void main(String[] args) {
		ImplementationC imp1 = new ImplementationC();
		// ImplementationC는 InterfaceA,B,C를 구현한 클래스로 methodA,B,C 모두 사용 가능
		imp1.methodA();
		imp1.methodB();
		imp1.methodC();
		
		InterfaceA ia = imp1; /* InterfaceA 객체 생성이 아니라(인터페이스는 객체 생성X) InterfaceA 타입의 매개변수 ia에 
							     InterfaceA, B, C를 구현한 ImplementationC 객체 주소(?)를 대입
							     그 결과 InerfaceA 타입에서 가져온 methodA만 사용할 수 있음 */
		ia.methodA();
		System.out.println();
		
		InterfaceB ib = imp1;
		ib.methodB();
		//ib.methodA() InterfaceA와 B는 아무런 상관이 없기 때문에 methodA는 사용할 수 없음
		System.out.println();
		
		InterfaceC ic = imp1; //InterfaceC는 InterfaceA와 B를 상속받았기 때문에 methodA, B, C 모두 사용 가능
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
	}
}

// 외부 클래스 먼저 객체 생성
// 내부 클래스는 객체 생성X, 설계도(코드) 형태로 들어감
// A릉 통한 곳에 객체거 생성됨.

//리스소 형태로 있는 B 객체 생성