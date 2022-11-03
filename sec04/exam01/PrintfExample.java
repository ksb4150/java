package sec04.exam01;

public class PrintfExample {

	public static void main(String[] args) {
		int value = 123;
		System.out.printf("상품의 가격 : %d원 \n", value);
		//예상 결과 : 123원
		System.out.printf("상품의 가격 : %6d원 \n", value);
		//예상 결과 : [3칸 공백]123원
		System.out.printf("상품의 가격 : %-6d원 \n", value);
		//예상 결과 : 123[3칸 공백]원
		System.out.printf("상품의 가격 : %06d원 \n", value);
		//예상 결과 : 000123
		
		double area = 3.14150 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이 : %10.2f \n", 10, area);
		//예상 결과 : 반지름이 10인 원의 넓이 : [3칸 공백]314.150
		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s \n", 1, name, job);
		//예상 결과 : [5칸 공백]1 | 홍길동[7칸 공백] | [8칸 공백]도적
	}

}
