package sec02.exam07;

public class DoWhileSumForm1To100Example {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		do { // 조건식이 위에 없기 때문에 조건이 거짓이더라도 한 번은 무조건 실행됨.
			sum += i;
			i++;
		} while(i<=100);
		
		System.out.println("1~" + (i-1) + " 합 : " + sum);

	}

}
