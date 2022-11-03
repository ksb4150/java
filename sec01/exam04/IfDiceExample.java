package sec01.exam04;

public class IfDiceExample {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6)+1;
/* Math.random은 0 <= x < 1 까지의 랜덤한 숫자를 발생시킴
   ex) x = 0, 0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9
   그 다음 곱셉 연산을 진행해 0 ~ 5.4 까지의 숫자가 발생된다.
   그 후 int형으로 변환하면 정수형으로 변환되어 0~5까지의 숫자가 나온다.
   
   곱셉 연산을 진행할 숫자와 그 뒤에 더하기 연산을 진행할 숫자를 조절하여
   원하는 범위의 random 값을 만들 수 있다.
   (int)(Math.random()*9)+1 => 1~9까지
   (int)(Math.random()*10)+1 => 1~10까지
*/
		
		if(num==1) {
			System.out.println("1번이 나왔습니다.");
		} else if(num==2) {
			System.out.println("2번이 나왔습니다.");
		} else if(num==3) {
			System.out.println("3번이 나왔습니다.");
		} else if(num==4) {
			System.out.println("4번이 나왔습니다.");
		} else if(num==5) {
			System.out.println("5번이 나왔습니다.");
		} else {
			System.out.println("6번이 나왔습니다.");
		}

	}

}
