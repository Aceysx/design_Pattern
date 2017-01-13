package Design_pattern.mediator;

public  class Mediator {
	private Man man;
	private Woman woman;
	
	
	//婚介所设置简单配对规则
	public void getPair(){
		if(man.getCondition().equals(woman.getCondition())){
			System.out.println(man.getName()+"和"+woman.getName()+"条件符合，适合配对");
		}else{
			System.out.println("二人条件不符，不予配对");
		}
	}
	
	//设置两人配对信息
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
