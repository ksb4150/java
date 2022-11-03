package nowiamjava.exam02;

class Data<T extends Number> {
		//Number이거나 Number의 하위 클래스만 T에 가능, Integer && double 가능
	T obj;
	Data(T ob) {
		obj = ob;
	}
	
	int calcMultiple(int n) {
		return obj.intValue() * n; //double의 경우 값 손실 발생
	}
}

public class Code231 {
	public static void main(String[] args) {
		Data<Integer> d = new Data<Integer>(100);
		int result = d.calcMultiple(5);
		System.out.println(result);
		
		Data<Double> e = new Data<Double>(17.5);
		int result2 = e.calcMultiple(5);
		System.out.println(result2);
	}
}
