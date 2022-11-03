package sec02.exam05;

public class ArrayInArrayExample1 {

	public static void main(String[] args) {
		int[][] data = new int[3][4];
		
		data[0][0]=3;
		data[0][1]=6;
		data[0][2]=9;
		data[0][3]=12;
		data[1][0]=24;
		data[1][1]=21;
		data[1][2]=18;
		data[1][3]=15;
		data[2][0]=27;
		data[2][1]=30;
		data[2][2]=33;
		data[2][3]=36;
		
		for(int i=0;i<data.length; i++) {
			for(int y=0; y<data[i].length; y++) {
				System.out.print(data[i][y]+" ");
			}
			System.out.print("\n");
		}
	}

}
