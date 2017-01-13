package Design_pattern.Observe;

import java.util.Observable;
import java.util.Observer;

//需要实现Observer接口并实现响应的方法
public class MyObserve implements Observer{

//	callBack函数，当被观察者状态发生改变时调用
	@Override
	public void update(Observable o, Object arg) {	
		//接收传过来的对象
		Article article = (Article)arg;
		//通知其它简友的形式
		System.out.println("----------------------------------");
		System.out.println("有简友发布新文章：标题为：" + article.getTitle());
	}

}
