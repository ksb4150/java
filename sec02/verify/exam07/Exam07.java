package sec02.verify.exam07;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) throws Exception {
		boolean run = true; // 반복문의 실행 여부를 결정
		
		int balance = 0; // 통장에 들어있는 총금액
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------");
			System.out.print("선택> ");
			
			int menuNum = Integer.parseInt(scanner.nextLine()); 
				//scanner는 무조건 string으로 받아오기 때문에 parseInt와 같은 과정을 거쳐야 함.
			switch(menuNum) {
				case 1:
					System.out.print("예금액> ");
					balance += Integer.parseInt(scanner.nextLine());
					break;
					
				case 2:
					System.out.print("출금액> ");
					balance -= Integer.parseInt(scanner.nextLine());
					break;
					
				case 3:
					System.out.print("잔고> ");
					System.out.println(balance);
					break;
				
				case 4:
					run = false; // 반복문의 종료를 결정
					break;
			}
			
			System.out.println();
		}
		
		System.out.println("프로그램 종료");
	}

}
