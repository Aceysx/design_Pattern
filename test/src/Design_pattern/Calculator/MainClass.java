package Design_pattern.Calculator;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Double result = null;
		System.out.println("请输入第一个数");
		Double num1 = Double.parseDouble(scanner.nextLine());
		System.out.println("请输入操作符");
		String strOper = scanner.nextLine();
		System.out.println("请输入第二个数");
		Double num2 = Double.parseDouble(scanner.nextLine());
		
		Operation operation = Factory.getOperation(strOper);
		operation.setNum1(num1);
		operation.setNum2(num2);
		result = operation.getResult();
		System.out.println("结果为："+result);
	}
}
