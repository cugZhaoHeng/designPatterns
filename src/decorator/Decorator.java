package decorator;

public class Decorator implements ICar {
	private ICar icar;
	public Decorator(ICar icar) {
		this.icar = icar;
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		icar.move();
	}

}
