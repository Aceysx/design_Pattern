package Design_pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PenFactory {
	private Map<String,PenFlyweight> pool = new HashMap<>();
	
	//��ȡ/����Ǧ��
	public PenFlyweight getPen(String color){
		//�ӱʴ�����
		PenFlyweight pen = pool.get(color);
		if(pen == null){
//			���û���ҵ����ʹ���һ������ʴ�
			pen = new Pen(color);
			pool.put(color, pen);
		}
		return pen;
	}
	
	//���رʴ��бʵ�����
	public Integer getCount(){
		return pool.size();
	}
}
