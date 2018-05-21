package strategy;

public class NormalDiscout implements Discout {
	
	private double dis = 1d;
	
	public NormalDiscout(double dis) {
		this.dis = dis;
	}

	@Override
	public double acceptMoney(double count) {
		// TODO Auto-generated method stub
		return count * dis;
	}

}
