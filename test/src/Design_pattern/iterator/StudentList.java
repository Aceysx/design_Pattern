package Design_pattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentList {
	//名单
	private List<Student> students;

	//创建名单
	public StudentList(){
		students = new ArrayList<>();
	}
	
	//往名单中添加学生
	public void add(Student student){
		students.add(student);
	}
	
	//获取名单的迭代器
	public Iterator iterator(){
		return new Iter(students);
	}
}
