package sec02.exam02;

public class Anonymous {
	//필드 초기값으로 대입
	RemoteControl field = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
		/*RemoteControl은 인터페이스이므로 생성자가 없음.
		  위 과정은 인터페이스의 생성자를 사용하는 것이 아니라
		  인터페이스를 implement한 익명 객체의 생성자를 통해 객체를 만들고 객체의 주소를
		  field에 저장하는 과정임*/
	};
	
	//RemoteControl field2 = new RemoteControl(); 인터페이스는 생성자가 X
	
	void method1() {
		//로컬 변수값으로 대입
		RemoteControl localVar = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다.");
			}
			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다.");
			}
		};
		//로컬 변수 사용
		localVar.turnOn();
	}
	
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}
