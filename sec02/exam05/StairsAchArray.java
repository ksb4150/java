package sec02.exam05;

public class StairsAchArray {

	public static void main(String[] args) {
		// 가변 길이 다차원 배열 => 계단식 구조
		int data[][] = new int[3][];
		data[0] = new int[4]; // 배열 0행의 길이는 4, 0으로 초기화 됨.
		data[1] = new int[5]; // 배열 1행의 길이는 5, 0으로 초기화 됨.
		data[2] = new int[3]; // 배열 2행의 길이는 3, 0으로 초기화 됨.
		
		for(int x =0; x<data.length; x++) {
			for(int y=0; y<data[x].length; y++) {
				System.out.print(data[x][y]+" ");
			}
			System.out.println();
		}

	}

}
