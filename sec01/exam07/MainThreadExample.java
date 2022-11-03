package sec01.exam07;

public class MainThreadExample {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();
		// Thread이기 때문에 동시에 작업
		// user1이 실행되고 뒤따라서 user2가 작업됨
		// 때문에 공유 객체인 calculator 필드의 값이 바뀜
		
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();
	}
}
