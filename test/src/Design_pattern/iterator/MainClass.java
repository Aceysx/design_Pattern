package Design_pattern.iterator;

import java.util.Iterator;

public class MainClass {
	public static void main(String[] args) {
		Student xiaobai = new Student("110","小白", "man");
		Student dabai = new Student("112","大白", "man");
		Student wuhua = new Student("115","无化", "woman");
		Student wuchang = new Student("120","黑无常", "unknow");
		
		StudentList studentList = new StudentList();
		studentList.add(wuchang);
		studentList.add(wuhua);
		studentList.add(dabai);
		studentList.add(xiaobai);
		
		Iterator iterator = studentList.iterator();
		
		System.out.println("--------------------点名啦--------------------------------");
		while(iterator.hasNext()){
			Student student = (Student) iterator.next();
			System.out.println(student.getName() + "已到");
		}
	}
}
