package sec01.exam03;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return id.hashCode(); //String의 hashCode가 출력
	}
}

//protected 다른 패키지에 있는 자식과 같은 패키지 내의 클래스만 사용 가능
//