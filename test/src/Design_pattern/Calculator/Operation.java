package Design_pattern.Calculator;

public abstract class Operation {
	public Double num1;
	public Double num2;
	public abstract Double  getResult();
	
	
	public Double getNum1() {
		return num1;
	}
	public void setNum1(Double num1) {
		this.num1 = num1;
	}
	public Double getNum2() {
		return num2;
	}
	public void setNum2(Double num2) {
		this.num2 = num2;
	}
	
}
