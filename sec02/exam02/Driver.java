package sec02.exam02;

public class Driver {
	//생성자
	
	//메소드
	public void drive (Vehicle vehicle) {
					// Vehicle vehicle = taxi || bus 자동 타입 변환 발생되면서 (다형성)override된 메소드 사용
		vehicle.run();
		// vehicle.test(); 형변환으로 인해 Vehicle 인터페이스의 메소드를 override한 메소드만 사용 가능
	}
}
