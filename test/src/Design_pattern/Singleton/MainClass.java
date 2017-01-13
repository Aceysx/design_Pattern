package Design_pattern.Singleton;

public class MainClass {
	public static void main(String[] args) {
		Person person = Person.getPerson();
		person.setAge(20);
		person.setName("HAH");
		System.out.println(person.getName());
	}
}
