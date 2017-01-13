package Design_pattern.simpleFactory;

public class SimpleFactory {
//	��ԭʼ�Ĺ���ģʽ�����������µ�ʵ����ʱ����Ҫ�ڹ�����������һ��������
	public static Fruit getApple(){
		return new Apple();
	}
	public static Fruit getBanana(){
		return new Banana();
	}
	
	//�Ľ�ģʽ��Ȼ����ȱ�ݣ������µ�ʵ����ʱ����Ȼ����Ҫ������ӷ�����������Ҫ�ڷ�������Ӵ��롣
	public static Fruit getFruit(String className){
		if("apple".equalsIgnoreCase(className)){
			return new Apple();
		}else if("banana".equalsIgnoreCase(className)){
			return new Banana();
		}else{
			return null;
		}
	}
	
	public static Fruit getFruit(Class<?> className){
		 try {
			 return (Fruit) className.newInstance();
		}  catch (Exception e) {
			e.printStackTrace();
		}
		 return null;
	}
}
