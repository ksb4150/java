package sec02.exam06;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		// new 연산자를 사용하면 heap 영역에 생성된다.
		// heap 영역은 개발자가 마음대로 생성, 삭제할 수 있는 공간이다.
		int[][] mathScores = new int[2][3]; 
		for(int i=0; i<mathScores.length; i++) {
			for(int k=0; k<mathScores[i].length; k++) {
				System.out.println("mathScores["+i+"]["+k+"] = "
						+mathScores[i][k]);
			}
		}
		System.out.println();
		
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		for(int i =0; i<englishScores.length; i++) {
			for(int k=0; k<englishScores[i].length; k++) {
				System.out.println("englishScores["+i+"]["+k+"] = "
						+englishScores[i][k]);
			}
		}
		System.out.println();
		
		int[][] javaScores = {{95, 80}, {92, 96, 80}};
		for(int i=0; i<javaScores.length; i++) {
			for(int k=0; k<javaScores[i].length; k++) {
				System.out.println("javaScores["+i+"]["+k+"] = "
						+javaScores[i][k]);
			}
		}

	}

}
