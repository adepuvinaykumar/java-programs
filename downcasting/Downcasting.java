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
class Downcasting 
{
	public static void main(String[] args) 
	{
		//we cannot perform downcasting without performing upcasting
		Superclass sc = new Subclass();//upcasting
		
		Subclass s1 = (Subclass)sc; //downcasting
		s1.view();
	}
}
