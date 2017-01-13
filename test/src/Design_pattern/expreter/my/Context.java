package Design_pattern.expreter.my;

import java.util.HashMap;
import java.util.Map;


//�����Ľ�ɫ��ʹ��HashMap���洢���������Ӧ��ֵ
public class Context {
	//���ڱ����Ŀ����Ӧ�ķ���
	private Map<Subject,Integer> score = new HashMap<>();
	
	//Ϊÿ�ſ�������
	public void addScore(Subject subject, Integer score){
		this.score.put(subject, score);
	}
	
	//��ȡ��Ŀ��Ӧ�ķ���
	public Integer getScore(Subject subject){
		return this.score.get(subject);
	}
	
}
