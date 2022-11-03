package sec02.exam08;

public class CompareOperatorExample2 {

	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); // ==도 연산자이기 때문에 double로 자동 형변환이 이루어짐
		
		double v4 = 0.1; // double의 경우 0.100000000000000로 정확한 값을 같지만
		float v5 = 0.1f; // float은 0.100000(임의의 값)이 될 수 있음.
		System.out.println(v4 == v5);
		// == 연산으로 인해 v5는 double형으로 변환됨. 이 경우 임의의 값도 함께 double형으로 변환되기 때문에 false가 나옴
		// 때문에 float은 float으로만 계산해줘야 함.
		System.out.println((float)v4 == v5);
		// v4를 float으로 바꿔주면 6자리까지만 잘라서 비교하기 때문에 같다고 비교한다.
		System.out.println((int)(v4*10) == (int)(v5*10));

	}

}
