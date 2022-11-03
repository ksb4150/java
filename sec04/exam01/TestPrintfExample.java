package sec04.exam01;

public class TestPrintfExample {

	public static void main(String[] args) {
		System.out.printf("이름:%s, 나이:%d \n", "김수빈", 24);
		System.out.printf("이름:%1$s, 나이:%2$d", "김수빈", 24);
		System.out.printf("이름:%1$s, 나이:%3$d, 키:%2$d \n", "김수빈", 24, 158);
		// %순번$타입 형식으로 순번 표시할 수 있음

	}

}
