package sec01.exam03;

public class VariableExchangeExample {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x: " + x + ", y: " + y);
		
		// swap 진행 과정
		int temp = x; // temp = 3
		x = y; // x = 5
		y = temp; // y = 3
		System.out.println("After Swap Algorithm");
		System.out.println("x: " + x + ", y: " + y);

	}

}
