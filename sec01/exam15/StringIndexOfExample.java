package sec01.exam15;

public class StringIndexOfExample {

	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍"); //문자열이 포함되어 있는지 확인 후 문자열이 시작되는 인덱스 반환
		System.out.println(location);
		
		if(subject.indexOf("자바") != -1) {
			System.out.println("자바와 관련된 책이군요");
		} else { // 문자열이 포함되어 있지 않으면 indexOf가 -1 반환
			System.out.println("자바와 관련없는 책이군요");
		}
		
		
		String[] strarr = {"자바", "c언어", "파이썬", "c++", "어셈블리"};

		for(int i=0; i<strarr.length; i++) {
			int point = strarr[i].indexOf("c++");
			if(point != -1) {
				System.out.println("c++은 "+i+"인덱스에 있습니다.");
			}
		}
		
	}

}
