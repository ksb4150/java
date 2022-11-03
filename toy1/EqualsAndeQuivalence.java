package toy1;

public class EqualsAndeQuivalence {

	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "java";
		String str3 = "c";
		String s1 = new String("java");
		String s2 = new String("java");
		String s3 = new String("c");
		
		System.out.println("==");
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(str1 == s1);
		
		System.out.println("");
		System.out.println("equals");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(s1));
		System.out.println(s1.equals(str1));
	}

}
