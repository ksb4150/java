package sec02.exam09;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		int charCode = 'A'; // 저장되는 변수의 자료형이 int이기 때문에 keyCode가 저장됨. 유니코드X
		
		if( (charCode>=65) & (charCode<=90)) { // 1 & 1 = 1, 출력O
			System.out.println("대문자 이군요");
		}
		
		if( (charCode>=97) && (charCode<=122)) { // 0 && 1 = 0, 출력X
			System.out.println("소문자 이군요");
		}
		
		if( !(charCode<48) && !(charCode>57)) { // 1 && 0 = 0, 출력X
			System.out.println("0~9 숫자 이군요");
		}
		
		// 출력 값은 같지만 전혀 다른 방식으로 연산이 진행되고 있음
		
		int value = 6;
		
		if( (value%2 == 0) | (value%3==0)) {
			System.out.println("2 또는 3의 배수 이군요");
		}
		
		if( (value%2==0) || (value%3==0)) {
			System.out.println("2 또는 3의 배수 이군요.");
		}

	}

}
