package sec01.exam06;

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		int time = (int)(Math.random()*4)+8;
		System.out.println("[현재 시간: "+time+"시]");

		switch(time) {
		case 8:
			System.out.println("8시 출근합니다.");
		case 9:
			System.out.println("9시 회의를 합니다.");
		case 10:
			System.out.println("10시 업무를 봅니다.");
		default:
			System.out.println("11시 외근을 나갑니다.");
		
		
		} 
	}

}
