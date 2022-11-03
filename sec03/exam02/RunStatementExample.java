package sec03.exam02;

public class RunStatementExample {

	public static void main(String[] args) {
		int x = 1; // 휘발성 메모리(RAM)에 저장됨. / C 드라이브는 주기억 장치
		int y = 2;
		int t = 0, z = 1; // clean 코드가 아니기 때문에 권하지 않음.
		int result = x + y; // CPU에서 더하기 연산을 함. (처리)
		System.out.println(result);
		System.out.println(t + z);
	}

}

/*
 int x (는 선언) = 5 는 값 대입 -> 선언과 초기화
 int x = 4 다음에 x = 6하면 overwrite(덮어쓰기)됨 
 int는 제약조건 -> 4byte(0~3, 4개의 주소), 10진수형 정수만 저장
 double의 제약조건 -> 8byte(0~7, 8개의 주소), 수소점의 형태(소수점 15자리까지)
 
 클래스의 첫 번째 문자는 대문자, 메소드와 변수의 첫 번째 문자는 소문자로 시작
 
 자바는 기본형을 가지고 있기 때문에 진정한 객체지향 언어가 아니다.
 float는 소수점 6~9자리/단정도, double은 소수점 15자리/배정도(기본형)
 이때 float는 6자리까지만 온전히 보장하므로 6자리가 넘어가면 double 사용.
 */