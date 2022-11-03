package sec03.exam01;

public class PromotionExample {

	public static void main(String[] args) {
		//자동 타입 변환
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue : " + intValue);

		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드 : " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValuse : " + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue : " + floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue : " + doubleValue);

/*
		int testintValue = 65; char보다 큰 int를 바꿀 수 없음.
		char testcharValue = testintValue;
		
		
		byte byteValue = 65;
		char charValue = byteValue;(X)-> short shortValue = byteValue(O)
		돼도 하면 안됌.
*/
	}

}
