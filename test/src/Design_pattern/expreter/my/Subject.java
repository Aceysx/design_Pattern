package Design_pattern.expreter.my;

//终结者表达式角色
public class Subject extends Expression{

	//从context（Map）中获取当前科目的分数
	@Override
	public Integer result(Context context) {
		return context.getScore(this);
	}

}
