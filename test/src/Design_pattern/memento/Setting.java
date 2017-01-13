package Design_pattern.memento;

//�������
public class Setting {
	private String oper;
	
	//����һ���汾
	public Version createVersion(){
		return new Version(oper);
	}
	
	//�汾����
	public void backVersion(Version version){
         this.oper = version.getSetting();
         System.out.println("----�汾���ˣ�" + oper);
	}
	//���ò���
	public void setOper(String oper) {
		System.out.println("��ǰ������" + oper);
		this.oper = oper;
	}
	public String getOper() {
		return oper;
	}
}
