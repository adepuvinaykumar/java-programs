class Superclass
{
	public void test()
	{
		System.out.println("test method");
	}
}
class Subclass extends Superclass
{
	public void view()
	{
		System.out.println("view method");
	}
}
class Upcasting 
{
	public static void main(String[] args) 
	{
		Superclass sc = new Subclass();
		
		sc.test();
	}
}
