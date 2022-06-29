package test2;

public final class Singleton {
	private String name = "singleton class 1";
	
	
	private Singleton() {
		// 생성자를 만들 수 없도록 만든다
	}
	private volatile static Singleton SingletonInstance = null; // 메인메모리에서만 참조하도록
	
	public static Singleton getInstance() { // Double Check Locking
		if(SingletonInstance == null) {
			synchronized (Singleton.class) {
				if(SingletonInstance == null) {
					SingletonInstance = new Singleton();					
				}
			}
		}
		return SingletonInstance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
