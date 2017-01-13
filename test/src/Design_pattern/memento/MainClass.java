package Design_pattern.memento;

public class MainClass {
	public static void main(String[] args) {
		Caretaker caretaker = new Caretaker();
		Setting setting = new Setting();
		
		setting.setOper("开机");
		caretaker.addVersion(setting.createVersion());
		
		setting.setOper("关闭防火墙");
		caretaker.addVersion(setting.createVersion());
		
		setting.setOper("下载东西");
		caretaker.addVersion(setting.createVersion());
		
		setting.setOper("电脑中毒");
		caretaker.addVersion(setting.createVersion());
		
		//回退上一个版本
		setting.backVersion(caretaker.getVersion());
		
		
		System.out.println("所有版本号");
		//查看所有版本号
		caretaker.showVersions();
		
	}
}
