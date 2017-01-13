package Design_pattern.iterator;

public class Student {
	private String idCard;
	private String name;
	private String sex;
	
	public Student(String idCard, String name, String sex) {
		super();
		this.idCard = idCard;
		this.name = name;
		this.sex = sex;
	}
	
	
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
}
