package Design_pattern.Chain;

public class Student {
	private String name;
	private Integer Scholarship;//奖学金 
	private Integer grant;//助学金
	private boolean isPoor;//是否贫困
	
	//填充学生信息
	public Student(String name, Integer scholarship, Integer grant,
			boolean isPoor) {
		super();
		this.name = name;
		Scholarship = scholarship;
		this.grant = grant;
		this.isPoor = isPoor;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getScholarship() {
		return Scholarship;
	}
	public void setScholarship(Integer scholarship) {
		Scholarship = scholarship;
	}
	public Integer getGrant() {
		return grant;
	}
	public void setGrant(Integer grant) {
		this.grant = grant;
	}
	public boolean isPoor() {
		return isPoor;
	}
	public void setPoor(boolean isPoor) {
		this.isPoor = isPoor;
	}
	
	
}
