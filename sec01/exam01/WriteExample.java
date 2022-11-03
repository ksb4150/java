package sec01.exam01;

import java.io.*;

public class WriteExample {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/test1.db");
		//데이터 도착지 test1.db로 하는 파일 출력 스트림 생성
		
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		os.write(a);
		os.write(b);
		os.write(c);
		
		os.flush(); // 출력 버퍼에 잔류하는 모든 바이트를 출력
		os.close(); // 출력 스트림 닫기
	}
}
