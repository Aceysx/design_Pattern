package Design_pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyProxy implements InvocationHandler{
	private Object obj;//存储被代理对象信息
	
	//创建一个代理对象
	public Object bind(Object obj){
		this.obj = obj;
		return Proxy.newProxyInstance( 
				obj.getClass().getClassLoader(),//被代理对象的类加载器 
				obj.getClass().getInterfaces(),//被代理对象的所有接口
				this);//当前代理对象
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		tip();
		obj = method.invoke(this.obj, args);//购买
		finish();
		return null;
	}
	//提示
	public void tip(){
		System.out.println("买铅笔请投币一元");
	}
	//结算成功
	public void finish(){
		System.out.println("结算成功，点击参加大转盘活动");
	}
}
