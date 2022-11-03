package sec02.exam01;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		
		//익명 객체 필드 사용
		anony.field.wake();
		//anony.field.work(); 익명 객체의 것이라 사용 불가
		
		//익명 객체 로컬 변수 사용
		anony.method1();
		
		//익명 객체 매개값 사용
		anony.method2(
				new Person() {
					void study() {
						System.out.println("공부합시다.");
					}
					@Override
					void wake() {
						System.out.println("8시에 일어납니다.");
						study();
					}
				}
			);
	}

}
