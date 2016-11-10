package dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler
{
	private Object obj;
	
	public DynamicProxy(Object obj)
	{
		this.obj = obj;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable
	{
		System.out.println("Before calling: " + method);
		
		//System.out.println(proxy);
		method.invoke(this.obj, args);
		
		System.out.println("After calling: " + method);
		
		return null;
	}

}
