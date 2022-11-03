package sec02.exam04;

public class DriverTwoExample {
	public static void main(String[] args) {
		DriverTwo driver = new DriverTwo();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
	}
}
