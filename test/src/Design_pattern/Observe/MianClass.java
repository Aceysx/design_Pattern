package Design_pattern.Observe;

public class MianClass {
	public static void main(String[] args) {
		Article article = new Article();
		article.setTitle("初来乍到");
		article.setContent("第一篇简书");
		User user = new User();
		//为用户注册一个观察者
		user.addObserver(new MyObserve());
		//用户发表简书，（即被观察者状态发生改变）
		user.publishArticle(article);
	}
}
