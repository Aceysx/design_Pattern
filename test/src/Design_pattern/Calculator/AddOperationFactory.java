package Design_pattern.Calculator;

public class AddOperationFactory extends Operation {

	@Override
	public Double getResult() {
		return this.num1 + this.num2;
	}
	
}
