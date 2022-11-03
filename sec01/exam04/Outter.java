package sec01.exam04;

public class Outter {
	//자바 7 이전
	public void method1(final int arg) {
		final int localVariable = 1;
		//arg = 100
		//localVariable = 100;
		
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	//자바 8 이후
	public void method2(int arg) { // 명시되어 있지 않아도 final
		int localVariable = 1; // 명시되어 있지 않아도 final
		//arg = 100;
		//localVariable = 100;
		//내부에서 변경할 수 없으며 외부에서 받아온 값으로만 사용하도록 하기 위함 -> 클래스 내부 설정하기(?)
		
		
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}
