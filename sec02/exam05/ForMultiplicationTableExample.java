package sec02.exam05;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		for(int m=2; m<=2; m++) {
			System.out.println("*** "+m+"단 ***");
			
			for(int n=1; n<=9; n++) {
				System.out.println(m+"x"+n+"="+(m*n));
			} // n이 9에서 10으로 증가되고 끝나는 것이 아니라 외부 for문으로 이동하여
			  // 외부 for문의 변수 m을 증가시킨 후 외부 for문의 조건식을 확인한다.
			
		}

	}

}
