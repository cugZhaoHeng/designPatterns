package strategy;
/**
 * 
 * @author �Ժ�
 * @date 2018��4��27��
 * �����࣬�нӿڵ����ԣ����ݲ�ͬ������������ͬ��������
 */
public class Strategy {
	Discout dis;
	public Strategy(String str) {
		switch(str) {
		case "8��" :
			
			dis = new RebateDiscout(0.8);
			break;
		case "������" :
			dis = new NormalDiscout(1);
			break;
		case "��300��80" :
			dis = new ReturnDiscout(300, 80);
			break;
		default : throw new RuntimeException("��������ʵ�����");
		}
	}
	public double getMoney(double count) {
		return dis.acceptMoney(count);
	}
}                     
