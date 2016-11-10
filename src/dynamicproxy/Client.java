package dynamicproxy;

import java.lang.reflect.Proxy;

public class Client
{
	public static void main(String[] args)
	{
		RealSubject subject = new RealSubject();
		
		DynamicProxy proxy = new DynamicProxy(subject);
		
		Subject obj = (Subject)Proxy.newProxyInstance(subject.getClass().getClassLoader(), 
				subject.getClass().getInterfaces(), proxy);
	
		System.out.println(obj.getClass());
		obj.output("Hello World");
	}
}
