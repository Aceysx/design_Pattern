package Design_pattern.Observe;

import java.util.Observable;
import java.util.Observer;

//��Ҫʵ��Observer�ӿڲ�ʵ����Ӧ�ķ���
public class MyObserve implements Observer{

//	callBack�����������۲���״̬�����ı�ʱ����
	@Override
	public void update(Observable o, Object arg) {	
		//���մ������Ķ���
		Article article = (Article)arg;
		//֪ͨ�������ѵ���ʽ
		System.out.println("----------------------------------");
		System.out.println("�м��ѷ��������£�����Ϊ��" + article.getTitle());
	}

}
