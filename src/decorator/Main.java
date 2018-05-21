package decorator;

public class Main {
	public static void main(String[] args) {
		Car car = new Car();
		//car.move();
		
		FlyDecorator fly = new FlyDecorator(car);
		fly.move();
	}
}
