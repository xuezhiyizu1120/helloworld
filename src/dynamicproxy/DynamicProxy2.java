package dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy2 implements InvocationHandler
{
	// 被代理的对象
	private Object obj;
	
	private DynamicProxy2(Object obj)
	{
		this.obj = obj;
	}
	
	public static Object newDynamicProxy(Object obj)
	{
		Class<?> classType = obj.getClass();
		
		return Proxy.newProxyInstance(classType.getClassLoader(), 
				classType.getInterfaces(), new DynamicProxy2(obj));
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable
	{
		// TODO Auto-generated method stub
		
		//System.out.println("Before calling: " + method);
		
		Object result = method.invoke(this.obj, args);
		
		//System.out.println("After calling: " + method);
		
		return result;
	}
}
