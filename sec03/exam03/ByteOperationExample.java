package sec03.exam03;

public class ByteOperationExample {

	public static void main(String[] args) {
		byte result1 = 10 + 20;
		// literal 상수의 경우 int형이든 상관이 없음
		System.out.println(result1);
		
		byte x = 10;
		byte y = 20;
		int result2 = x + y;
//		byte result3 = x + y; 
//		cpu에서 x와 y를 더하기 연산할 때 int형으로 자동 형변환되기 때문에 안됌
		System.out.println(result2);

	}

}
