package sec01.exam04;

import java.util.*;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("JAVA");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("JAVA");	// 먼저 들어온 것과 나중에 들어온 것 중 무엇이 사라지는 지는 os가 결정
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체수 : "+size);
		
		Iterator<String> iterator = set.iterator(); //반복자 얻음
		while(iterator.hasNext()) { //hasNext는 해당 객체가 있는지 확인
			String element = iterator.next(); //next는 다음 객체로 이동
			System.out.println("\t"+element);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체수 : "+set.size());
		
		iterator = set.iterator();
		for(String element : set) { //객체 수 만큼 루핑(향상 for문)
			System.out.println("\t"+element);
		}
		
		set.clear(); //모든 객체를 제거
		if(set.isEmpty()) {
			System.out.println("비어 있음");
		}
	}
}
