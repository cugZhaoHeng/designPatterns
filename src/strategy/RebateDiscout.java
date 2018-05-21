package strategy;

public class RebateDiscout implements Discout {
	private double dis;
	public RebateDiscout(double dis) {
		this.dis = dis;
	}
	@Override
	public double acceptMoney(double count) {
		// TODO Auto-generated method stub
		return count * dis;
	}

}
