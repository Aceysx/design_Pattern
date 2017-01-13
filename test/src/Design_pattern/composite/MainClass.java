package Design_pattern.composite;

import java.util.List;

public class MainClass {
	public static void main(String[] args) {
		//����һ���ʺУ��ʺ���һ������Ĳ�
		PenBox penBox = new Layer("�ʺ�");
		//Ϊ�ʺ��������
		PenBox penLayer = new Layer("��һ�㣬װ���Ա�");
		PenBox pencilLayer = new Layer("�ڶ��㣬װǦ��");
		//����һ��͵�һ����ӵ��ʺ���
		penBox.add(penLayer);
		penBox.add(pencilLayer);
		
		
		//��Ǧ�ʲ��������֧��
		pencilLayer.add(new Pen("��ɫ"));
		pencilLayer.add(new Pen("��ɫ"));
		pencilLayer.add(new Pen("��ɫ"));
		
		//�����Աʲ��������֧��
		penLayer.add(new Pen("��ɫ"));
		penLayer.add(new Pen("��ɫ"));
		penLayer.add(new Pen("��ɫ"));
		
		//��ʾ�ʺ���ȫ���ı�
		display(penBox, 0);
	}
	//������ӡ�����ʺ�
	public static void display(PenBox penbox,Integer deep){
		for(int i = 0; i < deep; ++i){
			System.out.print("-");
		}
		penbox.display();
		if(penbox instanceof Pen){
			return;
		}
		List<PenBox> children = penbox.getChildren();
		for(PenBox child : children){
			if(child instanceof Pen){
				for(int i = 0; i <= deep; ++i){
					System.out.print("-");
				}
				child.display();
			}else{
				display(child, deep+1);
			}
		}
	}
}
