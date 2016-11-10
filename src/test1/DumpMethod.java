package test1;

import java.lang.reflect.Method;

public class DumpMethod
{
	public static void main(String[] args) throws Exception
	{
		Class<?> type = Class.forName(args[0]);
		
		Method[] methods = type.getMethods();

		for(Method method : methods)
		{
			System.out.println(method.toString());
		}
	}
}
