package Design_pattern.Chain;

public abstract class Handler {
	//��һ������ʹ��protected����������Է��ʣ�
	protected Handler handler = null;
	
	//���õ�ǰ������һ��
	public void setSuccessor(Handler handler){
		this.handler = handler;
	}
	
	//��ȡ��ǰ������һ��
	public Handler getSuccessor() {
		return handler;
	}
	
	//��ȡ��ǰ����ѧ��
	public abstract Integer getTuition(Student student, Integer tuition);

}
