package Design_pattern.Facade;

public class MainClass {
	public static void main(String[] args) {
		Facade pen = new Facade();
		pen.writeBlue();//使用蓝笔
		pen.writeRed();//使用红笔
		pen.writeYellow();//使用黄笔
	}
}
