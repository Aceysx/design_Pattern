package Design_pattern.brige;

public class MainClass {
	public static void main(String[] args) {
		//展示衣服的型号
		Clothes small = new Small();
		Clothes medium = new Medium();
		Clothes big = new Big();
		
		//小白试穿小号衣服
		Person xiaobai = new Xiaobai(small);
		xiaobai.tryIt();
		
		//大白试穿中号衣服
		Person dabai = new Dabai(medium);
		dabai.tryIt();
	}
}
