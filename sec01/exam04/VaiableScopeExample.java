package sec01.exam04;

public class VaiableScopeExample {

	public static void main(String[] args) {
		int v1 = 15;
		int v2 = 0; // 초기화 해야 함
		int v4 = 0;
		
		if(v1>10) {
			v2 = v1 - 10;
		}
		int v3 = v1 + v2 + 5;
		
		System.out.println("v1 : "+v1+", v2 : "+v2+", v3 : "+v3);
	}

}

/*
 
 0이면 양수, 1이면 음수
   [Sign bit] 64 32 16 8 4 2 1
   -> 1byte == 8bit
                   
 CPU가 제일 최적화되게 값을 가져올 수 있는 크기 - 4byte

 int와 int를 곱하기 연산할 때 int의 크기가 꽤 크기 때문에 long의 타입으로 받아야 안전하다.

*/