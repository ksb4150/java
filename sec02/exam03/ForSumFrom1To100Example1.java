package sec02.exam03;

public class ForSumFrom1To100Example1 {

	public static void main(String[] args) {
		int sum = 0;
		
		int i = 0;
		for(i=1; i<=100; i++) {
			sum += 1; // 0+1=1, 1+1=2, 2+1=3 ... 99+1=100
					  // i=1    i=2    i=3   ... i=100
		}
		
		System.out.println("1~"+(i-1)+"합: "+sum);

	}

}
