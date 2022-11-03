package sec01.exam02;

public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
		// 받은 매개변수가 없기 때문에 에러
		String data1 = args[0];
		String data2 = args[1];
		
		System.out.println("Args[0]: "+data1);
		System.out.println("args[1]: "+data2);
	}
}
