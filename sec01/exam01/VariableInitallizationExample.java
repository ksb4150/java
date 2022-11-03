package sec01.exam01;

public class VariableInitallizationExample {

	public static void main(String[] args) {
			int value = 20;
			int result = value + 30;
			
			System.out.println(result);
			
	} // 재사용 가능하게 저장된 변수들을 반납 -> scope

}

// CPU는 메모리에 저장되어 있는 값을 가져다가 연산을 할 수 있음
// 재사용 가능하게 할당 된 메모리 value, result -> 8byte
// 임시적으로 할당 된 메모리 literal 상수 20, 30 -> 8byte
// main 메서드를 처리하기 위해 할당 된 byte는 16byte (value, result, 20, 30 -> 4byte*4)