package sec05.exam04;

public class Singleton {
	
	private static Singleton sing = new Singleton();
	// private이기 대문에 외부에서는 보이지 않음
	private Singleton() {
		
	}
	
	static Singleton getInstance() {
		return sing;
	}
}
