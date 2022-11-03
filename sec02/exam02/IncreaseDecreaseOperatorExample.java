package sec02.exam02;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("----------------------");
		x++; // x=11
		++x; // x=12
		System.out.println("x="+x); //예상 결과 : 12
		
		System.out.println("----------------------");
		y--; // y=9
		--y; // y=8
		System.out.println("y="+y); //예상 결과 : 8
		
		System.out.println("----------------------");
		z=x++; // z=12, x=12
		// x=13
		System.out.println("z="+z); //예상 결과 : 12
		System.out.println("x="+x); //예상 결과 : 13
		
		System.out.println("----------------------");
		z = ++x; // z=14, x=14
		System.out.println("z="+z); //예상 결과 : 14
		System.out.println("x="+x); //예상 결과 : 14
		
		System.out.println("----------------------");
		z = ++x + y++; // x=15, y=8, z=23
		// y=9
		System.out.println("z="+z); //예상 결과 : 23
		System.out.println("x="+x); //예상 결과 : 15
		System.out.println("y="+y); //예상 결과 : 9
	}

}
