package sec02.exam05;

public class CharOperationExample {

	public static void main(String[] args) {
		char c1 = 'A' + 1; // A=65이기 때문에 65+1이 되서 c1 = 66
		char c2 = 'A'; // c2 = 65
		//char c3 = c2 + 1; 오른쪽 항이 리터럴 상수의 경우에는 상관없지만
		//			변수가 되는 경우 c2+1은 자동 형변환으로 int가 되어 컴파일 에러
		
		System.out.println("c1:" + c1);
		System.out.println("c2:" + c2);
		//System.out.println("c3:" + c3);

	}

}
