package sec04.exam03;

public class Car {
	//필드
	int gas;
	
	//생성자
	
	//메소드
	// set 또는 get 메서드들은 프로그래머가 필드 값을 직접적으로 변경하지 못하도록 함.(보안)
	void setGas(int gas) {
		this.gas = gas;
		// 초기화가 아니라 값 변경. 섹터를 이용해서 변경
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다.(gas잔량: "+gas+")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다.(gas잔량: "+gas+")");
				return; // 나를 포함한 메소드를 종료 후 이 메소드를 호출한 곳으로 이동
			}
		}
	}
}
