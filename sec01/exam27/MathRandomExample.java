package sec01.exam27;

public class MathRandomExample {
	public static void main(String[] args) {
		int num = (int)(Math.random()*6) + 1;
		/* Math.random() -> 0 ~ 0.999999... 중 랜덤으로 수가 나옴
		 * 나온 수에 6을 곱해주면 0 ~ 5.4... 중의 수가 나오며 int형으로 바꿔주면 0~5가 나온다
		 * 여기에 1을 더해주면 1~6의 숫자가 나오며 이를 이용해 주사위 게임을 만들 수 있다.
		 * */
		
		System.out.println("주사위 눈:"+num);
	}
}
