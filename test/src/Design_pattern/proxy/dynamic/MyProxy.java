package Design_pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyProxy implements InvocationHandler{
	private Object obj;//�洢�����������Ϣ
	
	//����һ���������
	public Object bind(Object obj){
		this.obj = obj;
		return Proxy.newProxyInstance( 
				obj.getClass().getClassLoader(),//����������������� 
				obj.getClass().getInterfaces(),//�������������нӿ�
				this);//��ǰ�������
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		tip();
		obj = method.invoke(this.obj, args);//����
		finish();
		return null;
	}
	//��ʾ
	public void tip(){
		System.out.println("��Ǧ����Ͷ��һԪ");
	}
	//����ɹ�
	public void finish(){
		System.out.println("����ɹ�������μӴ�ת�̻");
	}
}
