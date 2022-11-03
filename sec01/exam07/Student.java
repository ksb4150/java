package sec01.exam07;

public class Student {
	public int sno;
	public String name;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	
	@Override
	public boolean equals (Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			return (sno==student.sno) && (name.equals(student.name));
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return sno + name.hashCode();
	}
}

//클래스 필드는 private로 하고 get, set 메서드 사용하는게 좋음
//문자열이면 hashCode는 스트링
//선언부가 같아야 한다. -> 매개변수 까지도 (override)
//String은 ==로 비교 불가 -> equal로 하기
//name에 해당하는 10진수 코드가 나옴 -> name.hashCode();