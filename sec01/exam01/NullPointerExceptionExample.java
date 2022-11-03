package sec01.exam01;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		String data = null; //data가 가리키고 있는 객체가 없기 때문에 에러
		System.out.println(data.toString());
	}
}
