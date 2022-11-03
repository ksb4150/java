package sec04.exam05;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while(true) {
			inputData = scanner.nextLine();
			System.out.println("입력된 문자열 : \"" + inputData + "\"");
			
			if(inputData.equals("q")) {
			 break;
			}
		}

			System.out.println("종료");
	}

}

// new Scanner(System.in) 객체를 생성할 때 매개변수로 System.in을 주어 scanner 객체가
// System.in을 사용할 수 있게 됌.
// Scanner의 입력값은 String에 저장!
// .equals(?) ?와 같은 값이면 true 반환, 다르면 false 반환
// nextLine은 엔터를 만날때까지 실행하고 줄바꿈
// break는 가장 가까운 반복문을 탈출