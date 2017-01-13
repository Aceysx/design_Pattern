package Design_pattern.prototype;

import java.util.HashSet;
import java.util.Set;

public class MainClass {
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.setName("哈哈");
		person1.setAge(11);
		Set<String> friends = new HashSet<>();
		friends.add("jon");
		friends.add("daa");
		person1.setFriends(friends);
		
//		使用克隆方式复制对象
		Person person2 = person1.getPerson();
		System.out.println("*****************普通类型*******************");
		person1.setAge(12);
		System.out.println("person1.age:"+person1.getAge());
		System.out.println("person2.age:"+person2.getAge());
		
		System.out.println("*****************复杂类型*******************");
		friends.add("new");
		person1.setFriends(friends);
		System.out.println("person1.friends:"+person1.getFriends().toString());
		System.out.println("person2.friends:"+person2.getFriends().toString());
	}
}
