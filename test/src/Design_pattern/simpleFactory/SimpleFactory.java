package Design_pattern.simpleFactory;

public class SimpleFactory {
//	最原始的工厂模式。。。当有新的实现类时都需要在工厂类添加添加一个方法。
	public static Fruit getApple(){
		return new Apple();
	}
	public static Fruit getBanana(){
		return new Banana();
	}
	
	//改进模式依然存在缺陷，在有新的实现类时，虽然不需要重新添加方法，但还是要在方法中添加代码。
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
