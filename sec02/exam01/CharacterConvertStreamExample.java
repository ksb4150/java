package sec02.exam01;

import java.io.*;

public class CharacterConvertStreamExample {
	public static void main(String[] args) throws Exception {
		write("문자 변환 스트림을 사용합니다."); //문자라 2byte 처리 해줘야 함
		String data = read();
		System.out.println(data);
	} // end main
	
	public static void write(String str) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Temp/test1.txt"); //1byte처리
		Writer writer = new OutputStreamWriter(fos); //fileoutputstream은 깨지기 때문에 2byte 사용
		writer.write(str);
		writer.flush();
		writer.close();
	}
	
	public static String read() throws Exception {
		FileInputStream fis = new FileInputStream("C:/Temp/test1.txt"); // 읽어올 애들은 2byte라서 깨짐
		Reader reader = new InputStreamReader(fis);
		char[] buffer = new char[100];
		int readCharNum = reader.read(buffer);
		reader.close();
		String data = new String(buffer, 0, readCharNum);
	
		return data;
	}
}

//이 클래스와 같은 위치에 가서 파일 리소스를 가져와서 경로를 가져와라 -> String 형으로 