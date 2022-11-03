package sec02.exam07;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		String[] strArray = new String[3];
		strArray[0] = "Java"; // heap 영역에 "Java" 있는지 스캔 후 없으면 생성
		strArray[1] = "Java"; // heap 영역에 "Java"가 있는지 스캔 후 있으면 같은 주소 참조
		strArray[2] = new String("Java"); // heap 영역에 새로운 "Java" 생성
		
		System.out.println(strArray[0] == strArray[1]); // 주소 비교
		System.out.println(strArray[0] == strArray[2]); 
		System.out.println(strArray[1].equals(strArray[2])); // 문자열 비교

	}

}
