package Design_pattern.mediator;

public class Man extends Person{

	public Man(Mediator mediator, String name, Integer condition) {
		super(mediator, name, condition);
	}
	
	//������Ͷ������Ϣ
	@Override
	public void toMediator() {
		this.getMediator().setMan(this);
		this.getMediator().getPair();
	}
	
}
