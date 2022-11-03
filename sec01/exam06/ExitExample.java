package sec01.exam06;

public class ExitExample {
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			if(i==5) {
				System.exit(0); //JVM을 강제 종료
				//break 물리적으로 종료되기 때문에 사용X
			}
			System.out.println(i);
		}
		System.out.println("마무리 코드");
	}
}
