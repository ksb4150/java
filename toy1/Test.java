package toy1;

public class Test {
	public static void main(String[] args) {
		String a = "subin";
		String b = a;
		String c = a;
		
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(b==c);
	}
}
