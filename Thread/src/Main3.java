public class Main3 {
	public static void main(String[] args) {
		Runnable sub = new Runnable() {
			@Override
			public void run() {
				print();
			}
		};

		Thread th1 = new Thread(sub);
		th1.start();
		th1.setName("th1");
		Thread th = Thread.currentThread();
		th.setName("MAIN");
		print();

		System.out.printf("%s : %s\n", th1.getName(), th1.getState());
		System.out.printf("%s : %s\n", th1.getName(), th1.getState());
		System.out.printf("%s : %s\n", th1.getName(), th1.getState());
		System.out.printf("%s : %s\n", th1.getName(), th1.getState());
		System.out.printf("%s : %s\n", th1.getName(), th1.getState());
		System.out.printf("%s : %s\n", th1.getName(), th1.getState());
		System.out.printf("%s : %s\n", th1.getName(), th1.getState());
		System.out.printf("%s : %s\n", th1.getName(), th1.getState());
		System.out.printf("%s : %s\n", th1.getName(), th1.getState());
		System.out.printf("%s : %s\n", th1.getName(), th1.getState());
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