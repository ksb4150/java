package sec04.exam04;

public class Calculator {
	//필드
	//생성자
	//메소드
	
	int plus(int x, int y) {
		int result = x+y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x,y);
		double result = sum/2;
		return result;
	}
	
	void execute() {
		double result = avg(7, 10); 
						//내부에서 메소드를 실행할 때는 메소드 이름으로 호출
		println("실행결과:"+result); //문자열과 숫자로 이루어져 연결 연산자 실행
								// 라이브러리가 아닌 개발자 메서드
		//System.out.println("실행결과:"+result);
	}
	
	void println(String message) {
		System.out.println(message);
	}
}
