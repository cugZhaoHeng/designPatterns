package factory;

public class OperationFactory {
	public static Operation createOperation(char c) {
		switch(c) {
		case '+' :
			return new AddOperation();
		case '-' :
			return new SubOperation();
		default : throw new RuntimeException("��������ȷ�������");
		}
	}
}
