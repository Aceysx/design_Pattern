package Design_pattern.prototype;

import java.util.HashSet;
import java.util.Set;

public class MainClass {
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.setName("����");
		person1.setAge(11);
		Set<String> friends = new HashSet<>();
		friends.add("jon");
		friends.add("daa");
		person1.setFriends(friends);
		
//		ʹ�ÿ�¡��ʽ���ƶ���
		Person person2 = person1.getPerson();
		System.out.println("*****************��ͨ����*******************");
		person1.setAge(12);
		System.out.println("person1.age:"+person1.getAge());
		System.out.println("person2.age:"+person2.getAge());
		
		System.out.println("*****************��������*******************");
		friends.add("new");
		person1.setFriends(friends);
		System.out.println("person1.friends:"+person1.getFriends().toString());
		System.out.println("person2.friends:"+person2.getFriends().toString());
	}
}
