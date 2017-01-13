package Design_pattern.template;

public abstract class Recruit {
	
	//����
	public abstract void propaganda();
	
	//����
	public abstract void preach();

	//����
	public abstract void signUp();
	
	//����
	public abstract void interview();
	
	//���
	public abstract void result();
	
	//ִ��
	public final void execute(){
		propaganda();
		preach();
		signUp();
		interview();
		result();
	}
}
