package Design_pattern.Observe;

public class MianClass {
	public static void main(String[] args) {
		Article article = new Article();
		article.setTitle("����է��");
		article.setContent("��һƪ����");
		User user = new User();
		//Ϊ�û�ע��һ���۲���
		user.addObserver(new MyObserve());
		//�û�������飬�������۲���״̬�����ı䣩
		user.publishArticle(article);
	}
}
