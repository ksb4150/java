package sec01.exam01;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "신민철"; // ex) 0x100
		String strVar2 = "신민철"; // ex) 0x100
		// String 변수에 문자열 리터럴을 대입할 경우 객체를 생성하기 전에 heap 메모리에
		// 같은 문자열이 존재하는지 스캔한다. 없으면 객체를 생성하고 있으면 같은 객체를 참조
		
		
		if(strVar1 == strVar2) { // 참조하고 있는 번지를 비교(0x100 == 0x100)
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strvar1과 strVar2는 참조가 다름");
		}
		
		if(strVar1.equals(strVar2)) { // 문자열을 비교(신민철 == 신민철)
			System.out.println("strVar과 strVar2는 문자열이 같음");
		}
		
		String strVar3 = new String("신민철"); // ex) 0x30 
		String strVar4 = new String("신민철"); // ex) 0x5
		// heap 영역에 무조건 새로운 String 객체를 생성한다.
		
		if(strVar3 == strVar4) { // 참조하고 있는 번지를 비교(0x30 == 0x5)
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		
		if(strVar3.equals(strVar4)) { // 문자열을 비교(신민철 == 신민철)
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
		
		if(strVar1.equals(strVar4)) { // 문자열을 비교(신민철 == 신민철)
			System.out.println("strVar1과 strVar4는 문자열이 같음");
		}

	}

}
