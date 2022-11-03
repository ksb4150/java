package sec01.exam23;

public class AutoBoxingUnBoxingExample {
	public static void main(String[] args) {
		//자동 박싱
		Integer obj = 100;
		System.out.println("value: "+obj.intValue());
		
		//대입 시 자동 언박싱
		int value = obj;
		System.out.println("value: "+value );
		
		//연산 시 자동 언박싱
		int result = obj + 100; //obj는 Integer형이기 때문에 계산 과정에서 자동으로 언박싱이 되며 덧셈 연산이 진행
		System.out.println("result: "+result);
	}
}
