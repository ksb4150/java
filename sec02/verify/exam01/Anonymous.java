package sec02.verify.exam01;

public class Anonymous {
	Worker field = new Worker() {
		@Override
		public void start() {
			System.out.println("일하고 있는데요");
		}
	};
	
	void method1() {
		Worker localVar = new Worker() {
			@Override
			public void start() {
				System.out.println("일하고 있다구요");
			}
		};
		
		localVar.start();
	}
	
	void method2(Worker worker) {
		worker.start();
	}
}
