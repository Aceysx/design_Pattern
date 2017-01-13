package Design_pattern.prototype;

import java.util.HashSet;
import java.util.Set;

//Ҫʹ�ÿ�¡����Ҫʵ��Cloneable�ӿڣ��ýӿ�ֻ����������ɱ���¡����û�д���
public class Person implements Cloneable{
	private String name;
	private Integer age;
	private Set<String> friends = new HashSet<>();
	
	public Person getPerson(){
		try {
			Person person1 = (Person) this.clone();
			Set<String> friends1 = new HashSet<>();
			for(String friend : this.getFriends()){
				friends1.add(friend);
			}
			person1.setFriends(friends1);
			return person1;
//			��û��ʵ��Cloneableʱclone�ᱨ�쳣
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
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
	public Set<String> getFriends() {
		return friends;
	}
	public void setFriends(Set<String> friends) {
		this.friends = friends;
	}
	
	
}
