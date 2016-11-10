package test1;

import java.lang.reflect.Method;

public class InvokerTst
{
	public static void main(String[] args) throws Exception
	{
		Class<Invoke> classType = Invoke.class;
		
		Invoke invoke = classType.newInstance();
		
		Method addMethod = 
			classType.getMethod("add", new Class[]{int.class, int.class});
		Method echoMethod = 
			classType.getMethod("echo", new Class[]{String.class});
		
		Integer o = (Integer)addMethod.invoke(invoke, new Object[]{1, 2});
		System.out.println(o.intValue());
		
		echoMethod.invoke(invoke, new Object[]{"Hello World"});
		
		
	
	}
}

class Invoke
{
	public int add(int num1, int num2)
	{
		return num1 + num2;
	}
	
	public void echo(String str)
	{
		System.out.println(str);
	}
}
