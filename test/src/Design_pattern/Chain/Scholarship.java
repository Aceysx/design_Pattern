package Design_pattern.Chain;

//��ѧ����
public class Scholarship extends Handler{
	@Override
	public Integer getTuition(Student student, Integer tuition) {
		//����н�ѧ��ѧ�Ѽ���
		if(student.getScholarship() > 0){
			tuition -= student.getScholarship();
			System.out.println("��ѧ������ѧ��:"+tuition);
			//�������һ���ʹ�����һ��
			if(this.getSuccessor() != null){
				return	this.getSuccessor().getTuition(student, tuition);
			}
		}
		return tuition;
	}

}
