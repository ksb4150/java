package sec02.exam02;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {83,90,87};
		
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 : " + sum1);
		
		int sum2 = add(new int[] {83,90,87}); 
		// scores하고는 다른 객체이면서 new를 통해 객체를 생성하고 주소값 전달
												
		System.out.println("총합 : " +sum2);
		System.out.println();
	}
	
	public static int add(int[] scores) {
		int sum=0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		return sum; // 문의 종료(자신을 포함한 메서드), 값 전달(호출한 곳에)
	}

}
