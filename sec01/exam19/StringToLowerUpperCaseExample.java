package sec01.exam19;

public class StringToLowerUpperCaseExample {
	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		
		System.out.println(str1.equals(str2));
		
		// 문자열의 내용이 같은지 확인하기 위해서는 toLowerCase 똔s toUpperCase를 해주어야 한다. (소,대문자를 구분하기 때문)
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2));
		
		System.out.println(str1.equalsIgnoreCase(str2));
		//대소문자를 무시하고 비교함. 
	}
}
