package sec02.exam03;

public class LongExample {

	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		//long var3 = 1000000000000;
		long var4 = 1000000000000L; 
	/*   위 숫자와 같은 경우 int의 크기를 넘는 수. 때문에 long 타입을 써야함.
		 long은 정수형의 기본형이 아니기 때문에 접미사 L를 붙여줘야 함.
		 L을 소문자로 써버리면 프로그래머가 식별하기 어려움으로 대문자로 써야함. */
		long var5 = 2147483647;
		long var6 = 2147483648L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);
	}

}
