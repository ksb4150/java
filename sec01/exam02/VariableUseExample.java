package sec01.exam02;

public class VariableUseExample {

	public static void main(String[] args) {
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간" + minute + "분");
		
		int totalMinute = (hour*60) + minute;
		System.out.println("총" + totalMinute + "분");
	}

}

// +는 다형성을 지원하는 대표적인 연산자
// 재사용 가능하게 할당 된 메모리 hour, minute, totalMinte -> 12byte
// 임시적으로 할당 된 메모리 3, 5, 60 -> 12byte
// 전체 할당 된 메모리는 -> 24byte
// 할당되는 메모리 주소?는 운영체제 마음