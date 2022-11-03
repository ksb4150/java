package sec03.exam02;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		Week today = null;
							// 싱글톤, 프로그래머가 값을 바꾸면 안됨
		Calendar cal = Calendar.getInstance(); //객체가 생성된 값을 받아온다.
		int week = cal.get(Calendar.DAY_OF_WEEK);
						// 요일을 1~7로 가져와서 week에 저장
		
		switch(week) {
			case 1:
				today = Week.SUNDAY;
				break;
				
			case 2:
				today = Week.MONDAY;
				break;
				
			case 3:
				today = Week.TUESDAY;
				break;
				
			case 4:
				today = Week.WEDNESDAY;
				break;
				
			case 5:
				today = Week.THURSDAY;
				break;
				
			case 6:
				today = Week.FRIDAY;
				break;
				
			case 7:
				today = Week.SATURDAY;
				break;
		}
		
		System.out.println("오늘 요일 : " + today);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바 공부합니다.");
		}

	}

}
