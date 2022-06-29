public class Main5 {
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
		System.out.printf("%s : %s\n", th1.getName(), th1.getState());


		Thread main = Thread.currentThread();
		main.setName("MAIN");
		if(th1.isAlive()) {
			try {
				th1.join(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			th1.interrupt();
		}
		
//		print();
		System.out.println("======MAIN 종료======");
	}

	private static void print() {
		Thread thread = Thread.currentThread();

		for (int i = 0; i < 10000; i++) {
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