package Design_pattern.Facade;

public class Facade {
	private Blue blue;
	private Yellow yellow;
	private Red red;
	//装笔芯
	public Facade() {
		blue = new Blue();
		yellow = new Yellow();
		red = new Red();
	}

	// 使用红笔
	public void writeRed() {
		red.write();
	}

	// 使用蓝笔
	public void writeBlue() {
		blue.write();
	}

	// 使用黄笔
	public void writeYellow() {
		yellow.write();
	}
}
