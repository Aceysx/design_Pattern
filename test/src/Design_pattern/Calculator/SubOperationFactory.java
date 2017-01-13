package Design_pattern.Calculator;

public class SubOperationFactory extends Operation {

	@Override
	public Double getResult() {
		return this.num1 - this.num2;
	}
	
}
