package test1;

public class TypeTest
{
	public static void main(String[] args) throws Exception
	{
		Class<?> classType = Integer.TYPE;
		
		Object o = classType.getConstructor(new Class[]{int.class}).newInstance(new Object[]{2});
		
		System.out.println(o instanceof Integer);
	}
}
