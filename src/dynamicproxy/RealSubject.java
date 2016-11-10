package dynamicproxy;

public class RealSubject implements Subject
{
	@Override
	public void output(String str)
	{
		// TODO Auto-generated method stub
		System.out.println(str);
	}
}
