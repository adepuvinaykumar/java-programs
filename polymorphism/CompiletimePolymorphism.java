class Addition
{
	public static void add(int i,int j)
	{
		System.out.println(i+j);
	}
	public static void add(int i,double j)
	{
		System.out.println(i+j);
	}
	public static void add(int i,int j,int k)
	{
		System.out.println(i+j+k);
	}
	
}
class CompiletimePolymorphism
{
	public static void main(String[]args)
	{
		Addition.add(2,3);
		Addition.add(2,4.5);
		Addition.add(3,5,7);
	}
}