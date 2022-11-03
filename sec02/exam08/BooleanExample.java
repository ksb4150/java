package sec02.exam08;

public class BooleanExample {

	public static void main(String[] args) {
		boolean stop = true;
		if(stop) {
			System.out.println("중지합니다.");
			//stop = false; 작성해도 if 문을 그냥 빠져나가기 때문에 else가 실행되지 않음
		} else {
			System.out.println("시작합니다.");
		}

	}

}
