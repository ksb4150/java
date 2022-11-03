package sec02.exam03;

import java.io.*;

public class ReadLineExample {
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("E:/kimsubin/pro01/src/sec02/exam03/language.txt");
				//ReadLineExample.class.getResource("language.txt").getPath());
		BufferedReader br = new BufferedReader(reader);
	
		int data1 = 1;
		while(true) {
			String data = br.readLine();
//			//data는 String형이다. readLind은 String을 반환함
//			//-1은 객체 생성이 안되서 null이 됨.
			if(data == null) break;
			System.out.println(data);			
		}
		br.close();
	}
}
