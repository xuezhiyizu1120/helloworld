package dynamicproxy;

import java.util.ArrayList;
import java.util.List;

public class Program
{
	public static void main(String[] args)
	{
		ArrayList<String> arrayList = new ArrayList<String>();
		List<String> list = (List<String>)DynamicProxy2.newDynamicProxy(arrayList);
	
		list.add("Hello");
		list.add("World");
		list.add("Welcome");
		
		for(String str : list)
		{
			System.out.println(str);
		}
		
	}
}
