package sec02.exam01;

public class FroPrintFrom1To10Example {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
		// 실행 순서 첫번째 초기화 진행 i=1, 두번째 조건식 i<=10 검사
		// true일 시 세번째 실행문 실행, 네번째 증감식 실행하여 i 1증가
		// 다섯번째 조건식 i<=10 검사, 여섯번째 true일 시 실행문 실행
		// 일곱번째 증감식 실행하여 i 1증가... 
		// 조건식에 의해 false 발생시 반복문 빠져나감
			System.out.println(i);
		}

	}

}
