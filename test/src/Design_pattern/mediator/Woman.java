package Design_pattern.mediator;

public class Woman extends Person{

	public Woman(Mediator mediator, String name, Integer condition) {
		super(mediator, name, condition);
	}

	//������Ͷ������Ϣ
	@Override
	public void toMediator() {
		this.getMediator().setWoman(this);
		this.getMediator().getPair();
		
	}
	
}
