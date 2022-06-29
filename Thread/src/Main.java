public class Main {
	public static void main(String[] args) {
		Thread th1 = new Thread(new Runnable() {
			@Override
			public void run() {
				print("th1");
			}
		});
		
		Thread th2 = new Thread(new Runnable() {
			@Override
			public void run() {
				print("th2");
			}
		});
		
		th1.start();
		th2.start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println("main: "+i);
		}
	}

	private static void print(String thread) {
		for (int i = 0; i < 100; i++) {
			System.out.println(thread + ": " + i);
		}
	}
}