package sec04.verify.exam02;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		// new 생성자 예약어를 사용해 객체가 생성되어 객체의 주소(번지)가 scanner에 저장됨
		// 이 객체를 Scanner형으로 읽어옴
		System.out.print("첫번째 수 : ");
		String strNum1 = scanner.nextLine();
		System.out.print("두번째 수 : ");
		String strNum2 = scanner.nextLine();
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		
		System.out.println("덧셈 결과 : " + result);

	}

}