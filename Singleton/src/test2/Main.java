package test2;

public class Main {
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		System.out.println(singleton1.toString());
		System.out.println(singleton2.toString());
	}
}
