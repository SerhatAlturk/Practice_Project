class A
{
	public A()
	{

	}
	public int a = 0;
	protected void methodA()
	{
		System.out.println("Method inside A");
	}
	protected void methodA(String a)
	{
		System.out.println("Method inside A | Overloaded with a parameter");
	}
}
class B extends A
{
	@Override
	public void methodA()
	{
		System.out.println("Method overwritten by B class");
	}
	@Override
	public void methodA(String a)
	{
		System.out.println("Method overwritten by B class | Overloaded with a parameter");
	}
}
class C extends A
{
	@Override
	public void methodA()
	{
		System.out.println("Method overwritten by C class");
	}
}
public class test
{
	public static void main(String[] args)
	{
		A obj = new A();
		A obj1 = new A();
		A obj2 = new B();
		A obj3 = new C();
		obj.a = 100;
		System.out.println(obj.a);
		obj1.a = 200;
		System.out.println(obj1.a);
		obj2.a = 300;
		System.out.println(obj2.a);
		obj3.a = 400;
		System.out.println(obj3.a);

		obj2.methodA("A");
	}
}
