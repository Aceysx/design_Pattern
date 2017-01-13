package Design_pattern.iterator;

import java.util.Iterator;

public class MainClass {
	public static void main(String[] args) {
		Student xiaobai = new Student("110","С��", "man");
		Student dabai = new Student("112","���", "man");
		Student wuhua = new Student("115","�޻�", "woman");
		Student wuchang = new Student("120","���޳�", "unknow");
		
		StudentList studentList = new StudentList();
		studentList.add(wuchang);
		studentList.add(wuhua);
		studentList.add(dabai);
		studentList.add(xiaobai);
		
		Iterator iterator = studentList.iterator();
		
		System.out.println("--------------------������--------------------------------");
		while(iterator.hasNext()){
			Student student = (Student) iterator.next();
			System.out.println(student.getName() + "�ѵ�");
		}
	}
}
