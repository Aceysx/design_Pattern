package Design_pattern.Singleton;

public class Person {
	private String name;
	private Integer age;
	
	private static Person person = null;
	private Person(){
		
	}
	public static  Person getPerson(){
		if(person == null){
			synchronized(Person.class){
				if(person == null){
					person = new Person();
				}
			}
			
		}
		return person;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
}
