package sec03.exam03;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
	public static void main(String[] args) throws Exception {
		File dir = new File("C:/Temp/image"); // 해당 경로를 가진 객체 생성
		File file1 = new File("C:/Temp/file1.txt");
		File file2 = new File("C:/Temp/file2.txt");
		File file3 = new File("C:/Temp/file3.txt");
		
		if(dir.exists() == false) { dir.mkdir(); } // 해당 경로에 실제로 파일 or 폴더가 있는지 확인하고 없으면 만들기
		if(file1.exists() == false) { file1.createNewFile(); }
		if(file2.exists() == false) { file2.createNewFile(); }
		if(file3.exists() == false) { file3.createNewFile(); }
		
		File temp = new File("C:/Temp"); 
		File[] contents = temp.listFiles(); // 해당 경로에 있는 내용 목록을 File 배열로 얻음
		
		System.out.println("시간\t\t\t형태\t\t크기\t이름");
		System.out.println("---------------------------------------------");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		for(File file : contents) {
			System.out.print(sdf.format(new Date(file.lastModified()))); // 파일이 마지막으로 수정된 시간을 반환
			if(file.isDirectory()) {
				System.out.print("\t<DIR>\t\t\t" + file.getName());
			} else {
				System.out.print("\t\t\t" + file.length() + "\t" + file.getName());
			}
			System.out.println();
		}
	}
}
