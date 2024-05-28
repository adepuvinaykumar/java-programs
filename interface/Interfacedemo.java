interface A
{
	void sample();
}
interface B
{
	void sample1();
}
class C implements A
{
	public void sample()
	{
		System.out.println("Sample method");
	}
	public void sample1()
	{
		System.out.println("sample1 method");
	}
}
class Interfacedemo
{
	public static void main(String[] args) 
	{
	  C b1 = new C();
	  b1.sample();
	  b1.sample1();
	}
}
