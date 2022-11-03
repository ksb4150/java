package sec01.exam08;

import sec01.exam02.*;

public class ClassExample {
					// 메인에서 throws Exception하고 있기 때문에 예외 발생시 메인 스레드에게 넘기고 자신은 정상 종료
	public static void main(String[] args) throws Exception {
		// import를 하면 같은 패키지가 아니어도 됨.
		
		// 첫 번째 방법
		Class clazz1 = People.class; 
		
		
		//두 번째 방법
		Class clazz2 = Class.forName("sec01.exam08.Car");
		
		//세 번째 방법
		Car car = new Car();
		Class clazz3 = car.getClass();
		
		System.out.println(clazz1.getName()); //패키지의 이름과 클래스 명까지
		System.out.println(clazz2.getSimpleName()); // 패키지 이름 제외
		System.out.println(clazz3.getPackage().getName()); // 패키지만
		
		try {
			Class clazz4 = Class.forName("sec01.exam07.Simpel"); //없어서 예외 발생
		} catch(ClassNotFoundException e) {
			System.out.println("Class가 없습니다.");
		} finally {
			System.out.println("clazz4를 살펴보세요");
		}
	}
}
