package Design_pattern.brige;

public class MainClass {
	public static void main(String[] args) {
		//չʾ�·����ͺ�
		Clothes small = new Small();
		Clothes medium = new Medium();
		Clothes big = new Big();
		
		//С���Դ�С���·�
		Person xiaobai = new Xiaobai(small);
		xiaobai.tryIt();
		
		//����Դ��к��·�
		Person dabai = new Dabai(medium);
		dabai.tryIt();
	}
}
