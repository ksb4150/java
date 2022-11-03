package sec01.exam11;

import java.io.IOException;

public class KeyboardToStringExample {
	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];
		
		System.out.println("입력 : ");
		int readByteNo = System.in.read(bytes);
					//read는 키보드에서 입력한 값을 bytes에 저장하고 읽은 바이트 수를 반환한다.
		String str = new String(bytes, 0, readByteNo-2);
					// 읽은 바이트 수 - 2를 하는 이유는 Enter(13, 10)가 들어가기 때문
		System.out.println(str);
		System.out.println(readByteNo);
	}
}
	