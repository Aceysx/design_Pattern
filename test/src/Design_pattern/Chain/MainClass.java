package Design_pattern.Chain;

public class MainClass {
	public static void main(String[] args) {
		//����װ������
		Scholarship scholarship = new Scholarship();
		Grant grant = new Grant();
		Poor poor = new Poor();
		
		scholarship.setSuccessor(grant);
		grant.setSuccessor(poor);
		
		//ѧ����Ϣ
		Student xiaobai = new Student("С��", 2000, 1500, true);
		Student zifan = new Student("���ӷ�", 1000, 500, false);
		
		//��ʼ����ѧ��
		System.out.println(xiaobai.getName()+"����ѧ��:"+scholarship.getTuition(xiaobai, 8000));
		System.out.println("-------------------------------------");
		System.out.println(zifan.getName()+"����ѧ��:"+scholarship.getTuition(zifan, 8000));
	}
}
