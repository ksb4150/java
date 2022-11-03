package sec04.exam02;

public class ComputerExample {

	public static void main(String[] args) {
		Computer myCom = new Computer();
		//new 연산자는 Computer 객체를 생성한후 번지를 받아서 대입 연산자를 통해
		//myCom에 저장한다. 이때 Computer형을 가짐.
		
		int[] values1 = {1,2,3};
		int result1 = myCom.sum1(values1);
		System.out.println("result1 : "+result1);
		
		int result2 = myCom.sum1(new int[] {1,2,3,4,5});
		System.out.println("result2 : "+result2);
		
		int result3 = myCom.sum2(1,2,3);
		System.out.println("result3 : "+result3);
		
		int result4 = myCom.sum2(new int[] {1,2,3,4,5});
		System.out.println("result4 : "+result4);

	}

}
