package sec03.exam02;

public class CastingExample {

	public static void main(String[] args) {
		int intValue = 44932;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue; 
		// 형 변환을 강제로 시킴, 프로그래머가 알고 있다는 것을 나타내므로 컴파이 에러가 발생하지 않음
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
		
		int testintValue = 128;
		byte testbyteValue = (byte) testintValue;
		//위와 같은 경우 컴파일 에러가 나지 않지만 값이 이상하게 나옴
		System.out.println(testbyteValue);

	}

}
