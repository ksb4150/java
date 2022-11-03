package sec02.exam10;

public class AdavancedForExample {

	public static void main(String[] args) {
		// String은 단순 주소만 저장됨.
		
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum=0;
		for (int score : scores) {
			sum = sum + score;
		}
		System.out.println("점수 총합 = " + sum);
		
		double avg = (double) sum / scores.length; // 평균은 소수점 2자리까지
		System.out.println("점수 평균 = " + avg);

	}

}
