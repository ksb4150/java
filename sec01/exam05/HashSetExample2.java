package sec01.exam05;

import java.util.*;

public class HashSetExample2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		// 프로그래머가 작성한 타입이 들어감
		// 때문에 equals를 사용할 수 없어 재정의 해야함
		
		set.add(new Member("홍길동", 30)); 
		set.add(new Member("홍길동", 30)); //add에는 equals와 hashCode의 과정이 포함되어 있음
		
		System.out.println("총 객체수 : "+set.size());
	}
}
