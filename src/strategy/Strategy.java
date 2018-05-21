package strategy;
/**
 * 
 * @author 赵恒
 * @date 2018年4月27日
 * 策略类，有接口的属性，根据不同的条件创建不同的派生类
 */
public class Strategy {
	Discout dis;
	public Strategy(String str) {
		switch(str) {
		case "8折" :
			
			dis = new RebateDiscout(0.8);
			break;
		case "不打折" :
			dis = new NormalDiscout(1);
			break;
		case "满300减80" :
			dis = new ReturnDiscout(300, 80);
			break;
		default : throw new RuntimeException("请输入合适的描述");
		}
	}
	public double getMoney(double count) {
		return dis.acceptMoney(count);
	}
}                     
