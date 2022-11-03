package sec03.exam06;

public class StringConcatExample {

	public static void main(String[] args) {
		//숫자 연산
		int value = 10 + 2 + 8;
		// 숫자끼리만 있으면 덧셈 연산 진행
		System.out.println("value : " + value);
		
		//결합 연산
		String str1 = 10 + 2 + "8";
		System.out.println("str1 : " + str1);
		// 10+2 -> 12, 12+"8"은 8이 문자열이기 때문에 결합 연산 진행해서 문자열이 됌
		
		String str2 = 10 + "2" + 8;
		System.out.println("str2 : " + str2);
		// 10+"2"는 2가 문자열이기 때문에 결합 연산을 진행해서 문자열 "102"이 됌.
		// "102"+8에서 102가 문자열이기 때문에 결합 연산을 진행해서 문자열 "1028"이 됌.
		
		String str3 = "10" + 2 + 8;
		System.out.println("str3 : " + str3);
		
		String str4 = "10" + (2 + 8);
		System.out.println("str4 : " + str4);
		//(2+8)은 숫자와 숫자 이기 때문에 덧셈 연산이 진행되어 숫자 10이 됌.
		//문자열 "10"과 숫자 10이 만나 결합 연산이 진행되서 문자열 "1010"이 됌.
	}

}
