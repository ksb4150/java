package sec02.exam06;

public class WhilePrintFrom1To10Example {

	public static void main(String[] args) {
		int i = 1;
		while (i<=10) { // while문을 빠져나갈 때의 i의 값은 11
			System.out.println(i);
			i++;
		}
		// ***** i의 값을 사용하기도 함 *****
	}

}
