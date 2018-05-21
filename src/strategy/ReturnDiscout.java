package strategy;

public class ReturnDiscout implements Discout {
	private double baseMoney;
	private double returnMoney;
	
	public ReturnDiscout(double baseMoney, double returnMoney) {
		this.baseMoney = baseMoney;
		this.returnMoney = returnMoney;
	}
	@Override
	public double acceptMoney(double count) {
		// TODO Auto-generated method stub
		if(count >= baseMoney) {
			count -= Math.floor(count/baseMoney) * returnMoney;
		}
		return count;
	}

}
