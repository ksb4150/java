package sec02.exam09;

public class ArrayCopyExample {

	public static void main(String[] args) {
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		// String의 경우 객체의 주소가 복사되어 저장된다.
		// oldStrArray의 0 인덱스부터 newStrArray의 0 인덱스에 
		// oldStrArray의 length만큼 복사해서 저장해라
		
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i]+",");
		}
	
		System.out.println();
		
		// 개인 실습 때 주소값 비교해보기
		// 객체의 주소가 복사되었기 때문에 true
		System.out.println(oldStrArray[0] == newStrArray[0]);
	}
}
