package Design_pattern.expreter.my;

//�ս��߱��ʽ��ɫ
public class Subject extends Expression{

	//��context��Map���л�ȡ��ǰ��Ŀ�ķ���
	@Override
	public Integer result(Context context) {
		return context.getScore(this);
	}

}
