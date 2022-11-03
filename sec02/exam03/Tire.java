package sec02.exam03;

public class Tire {
	//필드
	public int maxRotation;
	public int accumulatedRotation;
	public String location;
	
	//생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll() {
		++accumulatedRotation;
		// 타이어가 사용할 수 있는지의 여부를 boolean으로 반환
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "Tire 수명 : "+(maxRotation-accumulatedRotation )+"회");
			return true;
		} else {
			System.out.println("***"+location+"Tire 펑크***");
			return false;
		}
	}
}
