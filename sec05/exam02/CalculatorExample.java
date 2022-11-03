package sec05.exam02;

public class CalculatorExample {

	public static void main(String[] args) {
		double result1 = 10*10*Calculator.pi; 
		//pi가 static변수기 때문에 클래스 이름으로 호출
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);

		System.out.println("result1 : "+result1);
		System.out.println("result2 : "+result2);
		System.out.println("result3 : "+result3);
	}

}
