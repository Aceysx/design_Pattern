package Design_pattern.expreter.my;

//���ս��߱��ʽ��ɫ
public class Add extends Expression{
	private Expression left;
	private Expression right;
	
	//�������ſ�Ŀ����
	public Add(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	//������
	@Override
	public Integer result(Context context) {
		return left.result(context) + right.result(context);
	}

}
