package Design_pattern.mediator;


//�����࣬����������Ϣ
public abstract class Person {
	private String name;
	private Integer condition;
	private Mediator mediator;
	
	public Person(Mediator mediator, String name, Integer condition) {
		this.mediator = mediator;
		this.name = name;
		this.condition = condition;
	}

	//������Ͷ������Ϣ����������ʵ��
	public abstract void toMediator();
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Mediator getMediator() {
		return mediator;
	}

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	public Integer getCondition() {
		return condition;
	}

	public void setCondition(Integer condition) {
		this.condition = condition;
	}
}
