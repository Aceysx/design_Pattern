package Design_pattern.composite;

import java.util.List;

public interface PenBox {
	//���һ�������ǰ����ӱ�
	public void add(PenBox penbox);
	//�Ƴ���ǰ����Ƴ���ǰ���д�ŵı�
	public void remove(PenBox penbox);
	//�鿴��ǰ���ǰ���еı�
	public void display();
	//��ȡ�ʺ��е����в��ǰ���е����б�
	public List<PenBox> getChildren();
}
