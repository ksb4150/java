package sec04.exam02;

public class Computer {
	int sum1(int[] values) { // 매개 변수의 개수를 모를 경우 배열로 선언해도 o
		int sum =0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	int sum2(int ... values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum+=values[i];
		}
		return sum;
	}
}
