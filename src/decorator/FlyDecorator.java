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
	 * װ�εķ���
	 */
	public void fly() {
		System.out.println("�һ���ɣ�");
	}
	
}
