package Design_pattern.Calculator;

public class Factory {
	public static Operation getOperation(String oper) {
		if("+".equals(oper)){
			return new AddOperationFactory();
		}else if("-".equals(oper)){
			return new SubOperationFactory();
		}else if("*".equals(oper)){
			return new RideOperationFactory();
		}else if("/".equals(oper)){
			return new DivOperationFactory();
		}
		return null;
	}
}
