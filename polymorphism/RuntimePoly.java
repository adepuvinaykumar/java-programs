interface Animal
{
	void noise();
}
class Lion implements Animal
{
	public void noise()
	{
	System.out.println("lion noise");
	}
}
class Tiger implements Animal
{
	public void noise()
	{
		System.out.println("tiger noise");
	}
}
class Cheetah implements Animal
{
	public void noise()
	{
		System.out.println("cheetah noise");
	}
}
class RuntimePoly
{
	public void animalNoise(Animal a)//using generalization
	{
		a.noise();
	}
	public static void main(String[]args)
	{
		RuntimePoly r = new RuntimePoly();
		r.animalNoise(new Lion());
		r.animalNoise(new Tiger());
		r.animalNoise(new Cheetah());
	}
}