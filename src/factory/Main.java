package factory;

import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("please input a operator:");
		sc = new Scanner(System.in);
		String operator = sc.next();
		Operation operation = OperationFactory.createOperation(operator.charAt(0));
		System.out.println(operation.calculate(4, 3));
	}

}
