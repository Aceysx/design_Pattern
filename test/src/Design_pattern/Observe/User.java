package Design_pattern.Observe;

import java.util.Observable;

public class User extends Observable{
	public void publishArticle(Article article){
		System.out.println("�ҷ������£����⣺"+article.getTitle() + ",����Ϊ��" + article.getContent());
//		���ñ��۲��ߵ�״̬���ı�
		this.setChanged();
//		֪ͨ�����е������۲��ߣ������ı������һ�����͹�ȥ
		this.notifyObservers(article);
		
	}
}
