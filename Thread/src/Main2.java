public class Main2 {
	public static void main(String[] args) {
		Runnable sub = new Runnable() {
			@Override
			public void run() {
				print();
			}
		};

		Thread th1 = new Thread(sub);

		Thread th2 = new Thread(sub);

		th1.start();
		th1.setName("th1");
		th2.start();
		th2.setName("th2");
		Thread th = Thread.currentThread();
		th.setName("MAIN");
		print();
	}

	private static void print() {
		Thread thread = Thread.currentThread();

		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(thread.getName() + ": " + i);
		}
	}

}