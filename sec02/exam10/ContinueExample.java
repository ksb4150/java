package sec02.exam10;

public class ContinueExample {
	// throws Exception은 예외가 발생했을 때 예외가 발생한 메소드를 호출한 개념에게
	//  문제를 떠넘겨서 우선 메소드는 정상 실행 시키는 것.
	public static void main(String[] args) throws Exception {
		for(int i=1; i<=10; i++) {
			if(i%2 != 0) { // (i%2 == 1) i는 홀수 일 때
				continue; // 중첩 반복문일 때는 가장 가까운 반복문으로 이동, 네이밍(X)
			}
			System.out.println(i);
		}
		
		System.out.println("--------------------");
		
		for(int t=1; t<=10; t++) {
			if(t%2 != 1) { // (t%2 == 0), t가 짝수 일 때
				continue;
			}
			System.out.println(t);
		}

	}

}
