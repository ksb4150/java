package sec01.exam07;

public class User2 extends Thread {
	private Calculator calculator;
	
	public void setCalculator (Calculator calculator) {
//		try {
//			Thread.sleep(10000);
//			this.setName("User2");
//			this.calculator = calculator;
//		} catch(InterruptedException e) {
//			
//		}
		this.setName("User2");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(50);
	}
}
