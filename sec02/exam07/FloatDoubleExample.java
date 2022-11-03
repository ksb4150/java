package sec02.exam07;

public class FloatDoubleExample {

	public static void main(String[] args) {
		//실수값 저장
		//float var1 = 3.14; float 타입의 변수보다 더 큰 double을 담으려 해서 컴파일 오류
		float var2 = 3.14f;
		double var3 = 3.14; //실수 타입의 기본형은 double이기 때문에 접미사X
		
		//정밀도 테스트
		float var4 = 0.1234567890123456789f; 
			//float은 6자리는 온전하게 보장, 7~9 자리는 불확실하게 보장. 
		double var5 = 0.1234567890123456789;
		
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
		
		//e 사용하기
		double var6 = 3e6;
		float var7 = 3e6F;
		double var8 = 2e-3;
		
		System.out.println("var6 " + var6);
		System.out.println("var7: " + var8);
		System.out.println("var8: " + var8);

	}

}
