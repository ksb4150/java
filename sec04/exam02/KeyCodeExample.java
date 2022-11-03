package sec04.exam02;

import java.io.IOException;

public class KeyCodeExample {
	
	public static void main(String[] args) throws IOException {
		int keyCode;
		
		keyCode = System.in.read(); //문자만 읽음
		System.out.println("keyCode : " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode);
		

	}
	/* 
	 0 = 48, A = 65, a = 97
	 엔터는 두 가지의 일은 진행함. CR:캐리지리턴(13)과 LF:라인 피드(10)
	 그래서 A를 치고 엔터를 눌러서 실행할 때 65, 13, 10을 진행
	 
	 위 코드는 3개 이상의 문자를 입력시 뒤에 문자가 짤리는 현상이 있음
	*/
}
