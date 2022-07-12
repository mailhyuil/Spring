package pattern;

public class UglyDuck extends Duck{
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public UglyDuck() {
		flyBehavior = new Fly();
		quackBehavior = new Quack();
	}

	@Override
	public void performFly() {
		flyBehavior.fly();
	}
	
	
	
	@Override
	public void performQuack() {
		quackBehavior.quack();
	}

	@Override
	protected String display() {
		return "못생긴 오리ㅠㅠ";
	}


	
	
}
