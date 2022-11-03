package sec01.exam01;

import java.util.*; //자료구조 들어있음

public class ArrayListExample {
	public static void main(String[] args) {
		// 배열과 다르게 길이를 지정 안해줘도 됌, 리스트는 가변적임
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP"); 
		list.add(2, "Database"); //인덱스 2에 Database 삽입, 인덱스 2부터 뒤로 밀림
		list.add("iBATIS");
		
		int size = list.size();
		System.out.println("총 객체수 : "+size); //저장된 총 객체 수 얻기
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2: "+skill);
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+" : "+str);
		}
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		list.remove("iBATIS"); //값으로 삭제 가능
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+" : "+str);
		}
	}
}
