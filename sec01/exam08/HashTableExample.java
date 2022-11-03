package sec01.exam08;

import java.util.*;

public class HashTableExample {
	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();
		
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner scanner = new Scanner(System.in);
	
		while(true) {
			System.out.println("아이디와 비밀번호를 입력해주세요.");
			System.out.print("아이디 : ");
			String id = scanner.nextLine();
			System.out.print("비밀번호 : ");
			String password = scanner.nextLine();
			System.out.println();
			
			if(map.containsKey(id)) {
				//containsKey는 map의 key를 모두 돌며 매개변수로 받은 id와 같은지 확인 (hashCode, equal 과정 포함)
				if(map.get(id).equals(password)) { // get(id)는 매개변수와 같은 key가 있으면 value 반환
					System.out.println("로그인되었습니다.");
					break;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			} else {
				System.out.println("입력하신 아이디가 존재하지 않습니다.");
			}
		}
	}
	
}
