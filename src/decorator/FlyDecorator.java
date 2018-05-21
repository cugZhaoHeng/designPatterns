package decorator;

public class FlyDecorator extends Decorator {

	public FlyDecorator(ICar icar) {
		super(icar);
	}
	
	public void move() {
		super.move();
		this.fly();
	}
	
	/**
	 * 装饰的方法
	 */
	public void fly() {
		System.out.println("我还会飞！");
	}
	
}
