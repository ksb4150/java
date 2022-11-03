package sec01.exam07;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	//synchronized 삽입하면 동기화 처리
	public void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(50);
		} catch(InterruptedException e) {
			
		}
		System.out.println(Thread.currentThread().getName()+": "+this.memory);
	}
}
