package sec03.exam04;

public class LongOperationExample {

	public static void main(String[] args) {
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		long result = value1 + value2 + value3;
	/* byte와 int를 산술 연산해서 int로 자동 형변환
	   다음 int와 long과 산술 연산해서 long으로 자동 형변환
	  short+short, byte+byte, short+byte, int+int, char+char 모두 int로 형변환 됨.
	   int보다 큰 타입을 만날때는 그 형으로 형변환 int+double -> double */
		System.out.println(result);

	}

}
