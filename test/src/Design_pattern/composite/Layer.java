package Design_pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Layer implements PenBox{

	private List<PenBox> layers;
	private String name;

	//����ǰ��һ������
	public Layer(String name) {
		layers = new ArrayList<>();
		this.name = name;
	}
	//����ǰ�����һ֧��
	@Override
	public void add(PenBox penbox) {
		layers.add(penbox);
	}
	//�Ƴ���ǰ���е�һ֧��
	@Override
	public void remove(PenBox penbox) {
		layers.remove(penbox);
	}
	//��ʾ��ǰ�������
	@Override
	public void display() {
		System.out.println(name);
	}
	//��ȡ��ǰ���е����б�
	@Override
	public List<PenBox> getChildren() {
		return this.layers;
	}

}
