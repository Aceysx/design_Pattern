package Design_pattern.iterator;

import java.util.Iterator;
import java.util.List;

//��ȡ������
class Iter implements Iterator{
	private List<?> lists;
	private Integer index = 0;
	
	//��ֵ���������
	public Iter(List<?> list){
		this.lists  = list;
	}
	
	//�ж��Ƿ�����һ��Ԫ��
	@Override
	public boolean hasNext() {
		if(index >= lists.size()){
			return false;
		}else{
			return true;
		}
	}

	//��ȡ��ǰԪ��
	@Override
	public Object next() {
		return lists.get(index++);
		 
	}

	//�Ƴ���ǰԪ��
	@Override
	public void remove() {
		lists.remove(index--);
	}
}