package sec02.exam09;

public class BreakOutterExample {

	public static void main(String[] args) throws Exception {
		Outter: for(char upper='A'; upper<='z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				// 예상결과
				// A-a \n A-b \n A-c \n A-d \n A-e \n A-f \n A-g \n
				if(lower=='g') {
					break Outter; 
					// 가장 가까운 반복문이 아닌 네이밍한 반복문을 빠져나감
				}
			}
//			if(upper=='z') {
//				break;			
//			} -> 이 경우 A-a 부터 z-z까지 출력
		}
		System.out.println("프로그램 실행 종료");
	}

}
