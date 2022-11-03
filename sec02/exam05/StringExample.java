package sec02.exam05;

public class StringExample {

	public static void main(String[] args) {
	/*  String은 레퍼런스 타입으로 주소값을 갖는 데이터 형태 
	 	""는 문자열, ''는 문자를 나타냄 */
		String name = "홍길동";
		String job = "프로그래머";
		char c1 = '홍';
		char c2 = '길';
		char c3 = '동';
		
		System.out.println(name);
		System.out.println(job);
		System.out.print(c1);
		System.out.print(c2);
		System.out.println(c3);
		System.out.println(c1+c2+c3);
		// char+char도 int로 형변환
	}

}
