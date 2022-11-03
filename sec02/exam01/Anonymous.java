package sec02.exam01;

public class Anonymous {
	//필드 초기값으로 대입
	Person field = new Person() { //Person 객체의 멤버가 아닌 work까지 포함해서 객체 생성
		void work() {
			System.out.println("출근합니다.");
		}
		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	};
	
	void method1() {
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책합니다.");
			}
			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
		};
		
		localVar.wake();
		//localVar.walk();
	}
	
	void method2(Person person) {
		person.wake();
		//person.studty();
	}
}