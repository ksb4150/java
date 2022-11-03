package sec01.exam01;

public class IfExample {

	public static void main(String[] args) {
		int score = 93;
		
		if(score>=93) { // 참이기 때문에 if문 실행
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}

		if(score<90) { // 거짓이기 때문에 if문 건너뜀
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B 입니다.");
		}
	}

}
