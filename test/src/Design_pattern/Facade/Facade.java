package Design_pattern.Facade;

public class Facade {
	private Blue blue;
	private Yellow yellow;
	private Red red;
	//װ��о
	public Facade() {
		blue = new Blue();
		yellow = new Yellow();
		red = new Red();
	}

	// ʹ�ú��
	public void writeRed() {
		red.write();
	}

	// ʹ������
	public void writeBlue() {
		blue.write();
	}

	// ʹ�ûƱ�
	public void writeYellow() {
		yellow.write();
	}
}
