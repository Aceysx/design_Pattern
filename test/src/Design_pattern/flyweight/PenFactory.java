package Design_pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PenFactory {
	private Map<String,PenFlyweight> pool = new HashMap<>();
	
	//获取/创建铅笔
	public PenFlyweight getPen(String color){
		//从笔袋中找
		PenFlyweight pen = pool.get(color);
		if(pen == null){
//			如果没有找到，就创建一个放入笔袋
			pen = new Pen(color);
			pool.put(color, pen);
		}
		return pen;
	}
	
	//返回笔袋中笔的数量
	public Integer getCount(){
		return pool.size();
	}
}
