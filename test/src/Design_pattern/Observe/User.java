package Design_pattern.Observe;

import java.util.Observable;

public class User extends Observable{
	public void publishArticle(Article article){
		System.out.println("我发表文章：标题："+article.getTitle() + ",内容为：" + article.getContent());
//		设置被观察者的状态被改变
		this.setChanged();
//		通知队列中的其它观察者，并将改变的内容一并发送过去
		this.notifyObservers(article);
		
	}
}
