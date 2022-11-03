package sec04.exam04;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCal = new Calculator();
		// 1. new연산자를 통해 생성자는 Calculator 객체를 생성하고 메모리에 점유시킨다.
		// 2. new연산자는 객체의 주소를 받아서 대입 연산자를 통해 myCal 레퍼런스 변수에 저장
		// 3. myCal을 올바르게 해석하기 위해 Calculator 형으로 해석
		myCal.execute(); //외부에서 메소드를 실행할 때는 참조변수를 사용해서 실행

	}

}
