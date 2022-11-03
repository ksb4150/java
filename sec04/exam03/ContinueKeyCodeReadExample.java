package sec04.exam03;

import java.io.IOException;

public class ContinueKeyCodeReadExample {

	public static void main(String[] args) throws IOException {
		int keyCode;
		
		while(true) { // 무한 반복문이므로 실행하지 마세요.
			keyCode = System.in.read();
			System.out.println("keyCode:"+keyCode);
		}

	}

}
