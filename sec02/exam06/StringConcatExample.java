package sec02.exam06;

public class StringConcatExample {

	public static void main(String[] args) {
		String str1 = "JDK" + 6.0; // 문자열이 있을 경우 +는 연결 연산자
		String str2 = str1 + " 특징";
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0;
		String str4 = 3 + 3.0 + "JDK"; 
		// 3+3.0은 리터럴이며 숫자와 숫자로 산술 연산이 진행되어 6.0이 되고 
		// 그 이후에는 문자열과 만나 연결 연산자
		System.out.println(str3);
		System.out.println(str4);

	}

}
