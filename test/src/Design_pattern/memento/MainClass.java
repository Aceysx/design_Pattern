package Design_pattern.memento;

public class MainClass {
	public static void main(String[] args) {
		Caretaker caretaker = new Caretaker();
		Setting setting = new Setting();
		
		setting.setOper("����");
		caretaker.addVersion(setting.createVersion());
		
		setting.setOper("�رշ���ǽ");
		caretaker.addVersion(setting.createVersion());
		
		setting.setOper("���ض���");
		caretaker.addVersion(setting.createVersion());
		
		setting.setOper("�����ж�");
		caretaker.addVersion(setting.createVersion());
		
		//������һ���汾
		setting.backVersion(caretaker.getVersion());
		
		
		System.out.println("���а汾��");
		//�鿴���а汾��
		caretaker.showVersions();
		
	}
}
