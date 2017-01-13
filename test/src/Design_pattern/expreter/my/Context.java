package Design_pattern.expreter.my;

import java.util.HashMap;
import java.util.Map;


//上下文角色，使用HashMap来存储变量及其对应的值
public class Context {
	//用于保存科目及相应的分数
	private Map<Subject,Integer> score = new HashMap<>();
	
	//为每门课填充分数
	public void addScore(Subject subject, Integer score){
		this.score.put(subject, score);
	}
	
	//获取科目对应的分数
	public Integer getScore(Subject subject){
		return this.score.get(subject);
	}
	
}
