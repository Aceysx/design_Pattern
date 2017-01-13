package Design_pattern.expreter.my;

//非终结者表达式角色
public class Add extends Expression{
	private Expression left;
	private Expression right;
	
	//传入两门科目名称
	public Add(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	//计算结果
	@Override
	public Integer result(Context context) {
		return left.result(context) + right.result(context);
	}

}
