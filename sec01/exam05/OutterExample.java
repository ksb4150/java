package sec01.exam05;

public class OutterExample {

	public static void main(String[] args) {
		Outter outter = new Outter(); //Outter의 객체만 생성, 내부에 있는 class Nested는 리소스 형태로만 존재
		Outter.Nested nested = outter.new Nested();
		nested.print();

	}

}
