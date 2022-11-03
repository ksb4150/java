package sec01.exam04;

public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "100";
		char data3 = 'a';
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2); //NumberFromatException 발생
		// a를 10진수의 숫자로 변환할 수 없기 때문에 에러
		
		int result = value1 + value2;
		System.out.println(data1+"+"+data2+"="+result);
	}
}
