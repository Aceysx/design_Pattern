package Design_pattern.Chain;

//��ѧ����
public class Grant extends Handler{

	public Integer getTuition(Student student, Integer tuition) {
		//�������ѧ��ѧ�Ѽ���
		if(student.getGrant() > 0){
			tuition -= student.getGrant();
			System.out.println("��ѧ������ѧ��:"+tuition);
			//�������һ���ʹ�����һ��
			if(this.getSuccessor() != null){
				return	this.getSuccessor().getTuition(student, tuition);
			}
		}
		return tuition;
	}
}
