package Design_pattern.Calculator;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Double result = null;
		System.out.println("�������һ����");
		Double num1 = Double.parseDouble(scanner.nextLine());
		System.out.println("�����������");
		String strOper = scanner.nextLine();
		System.out.println("������ڶ�����");
		Double num2 = Double.parseDouble(scanner.nextLine());
		
		Operation operation = Factory.getOperation(strOper);
		operation.setNum1(num1);
		operation.setNum2(num2);
		result = operation.getResult();
		System.out.println("���Ϊ��"+result);
	}
}
