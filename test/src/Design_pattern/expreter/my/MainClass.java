package Design_pattern.expreter.my;

public class MainClass {
	public static void main(String[] args) {
		//��������ſ�Ŀ�����Ӧ����
		Context context = new Context();
		
		//������Ŀ
		Subject math = new Subject();
		Subject chinese = new Subject();
		Subject english = new Subject();
		
		//�������
		context.addScore(math, 61);
		context.addScore(chinese, 60);
		context.addScore(english, 65);
		
		//���������ܷ���
		Expression result = new Add(new Add(math, chinese), english) ;
		
		System.out.println("�ܷ���Ϊ��" + result.result(context));
		
	}
}
