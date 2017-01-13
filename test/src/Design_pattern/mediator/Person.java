package Design_pattern.mediator;


//抽象类，包含基本信息
public abstract class Person {
	private String name;
	private Integer condition;
	private Mediator mediator;
	
	public Person(Mediator mediator, String name, Integer condition) {
		this.mediator = mediator;
		this.name = name;
		this.condition = condition;
	}

	//向婚介所投个人信息，具体子类实现
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
