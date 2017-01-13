package Design_pattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentList {
	//����
	private List<Student> students;

	//��������
	public StudentList(){
		students = new ArrayList<>();
	}
	
	//�����������ѧ��
	public void add(Student student){
		students.add(student);
	}
	
	//��ȡ�����ĵ�����
	public Iterator iterator(){
		return new Iter(students);
	}
}
