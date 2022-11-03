package sec02.exam03;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare(); vehicle은 Vehicle 타입이기 때문에 Vehicle에서 가져온 메소드만 사용할 수 있음
		
		Bus bus = (Bus) vehicle; //강제 타입 변환, 옳은 방법은 아님(오류 날 수도 있음)
								 //여전히 vehicle은 checkFare 사용할 수 없음
		
		bus.run();
		bus.checkFare(); // bus는 Bus 타입이기 때문에 Bus에서 만든 메소드까지 사용할 수 있음
	}

}
