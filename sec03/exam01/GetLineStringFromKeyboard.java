package sec03.exam01;

import java.io.*;

public class GetLineStringFromKeyboard {
	public static void main(String[] args) throws Exception {
		InputStream is = System.in;	// 키보드와 연결된 input스트림
		Reader reader = new InputStreamReader(is); // 2바이트씩 읽어올 수 있는 스트림
		BufferedReader br = new BufferedReader(reader); // 문장 단위로 읽어올 수 있도록 버퍼 씌우기
		
		while(true) {
			System.out.print("입력하세요 : ");
			String lineStr = br.readLine(); //enter을 만날대까지 입력 받기
			if(lineStr.equals("q") || lineStr.equals("quit")) break;
			System.out.print("입력된 내용 : "+lineStr);
			System.out.println();
		}
		
		br.close();
	}
}

