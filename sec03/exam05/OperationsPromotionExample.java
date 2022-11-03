package sec03.exam05;

public class OperationsPromotionExample {

	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
	/*  byte byteValue3 = byteValue1 + byteValue2;
		byte+byte는 int가 되기 대문에 컴파일 에러 */
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
	/*  char charValue3 = charValue1 + charValue2 
		char+char는 int가 되기 때문에 컴파일 에러 */
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드 = "+ intValue2);
		System.out.println("출력문자 = "+ (char)intValue2); 
									   //int를 강제로 char로 바꿔줘서 B출력
		
		int intValue3 = 10;
		int intValue4 = intValue3 / 4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
	/*  int intValue6 = 10 / 4.0;
		10은 int 4.0은 double이기 때문에 int+double은 double이 되기 때문에 컴파일 에러 */
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
		
		int x = 1;
		int y = 2;
		double result = (double) x / y; //이와 같은 강제 타입변환은 casting이라 함
		// double과 int가 만나 산술연산을 진행하고 int보다 큰 double로 형변환
		System.out.println(result);
		
	}

}
