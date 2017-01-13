package Design_pattern.Chain;

//ƶ������
public class Poor extends Handler{

	public Integer getTuition(Student student, Integer tuition) {
		//���ƶ��������1000
		if(student.isPoor()){
			tuition -= 1000;
			System.out.println("ƶ�������ѧ��:"+tuition);
			//�������һ���ʹ�����һ��
			if(this.getSuccessor() != null){
				return	this.getSuccessor().getTuition(student, tuition);
			}
		}
		return tuition;
	}

}
