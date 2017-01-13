package Design_pattern.iterator;

import java.util.Iterator;
import java.util.List;

//获取迭代器
class Iter implements Iterator{
	private List<?> lists;
	private Integer index = 0;
	
	//将值传入迭代器
	public Iter(List<?> list){
		this.lists  = list;
	}
	
	//判断是否有下一个元素
	@Override
	public boolean hasNext() {
		if(index >= lists.size()){
			return false;
		}else{
			return true;
		}
	}

	//获取当前元素
	@Override
	public Object next() {
		return lists.get(index++);
		 
	}

	//移除当前元素
	@Override
	public void remove() {
		lists.remove(index--);
	}
}