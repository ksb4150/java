package sec02.verify.exam11;

import java.util.Scanner;

public class Exam11 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String name = scanner.nextLine();
		
		System.out.print("패스워드 : ");
		String strPassword = scanner.nextLine(); // 숫자가 아닌 문자 입력시 에러 발생
		
		int password = Integer.parseInt(strPassword); 
		
		if(name.equals("java")) {
			if(password == 12345) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패 : 패스워드가 틀림");
			}
		} else {
			System.out.println("로그인 실패 : 아이디 존재하지 않음");
		}

	}

}
