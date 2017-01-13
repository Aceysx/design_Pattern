package Design_pattern.mediator;

public  class Mediator {
	private Man man;
	private Woman woman;
	
	
	//��������ü���Թ���
	public void getPair(){
		if(man.getCondition().equals(woman.getCondition())){
			System.out.println(man.getName()+"��"+woman.getName()+"�������ϣ��ʺ����");
		}else{
			System.out.println("���������������������");
		}
	}
	
	//�������������Ϣ
	public void setPair(Man man , Woman woman){
		this.man = man;
		this.woman = woman;
	}
	
	
	
	public Man getMan() {
		return man;
	}
	public void setMan(Man man) {
		this.man = man;
	}
	public Woman getWoman() {
		return woman;
	}
	public void setWoman(Woman woman) {
		this.woman = woman;
	}
	
	
	
}
