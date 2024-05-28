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
class RuntimePolymorphism
{
	public static void animalNoise(Animal a)
	{
		a.noise();
	}
	public static void main(String[]args)
	{
		animalNoise(new Lion());
		animalNoise(new Tiger());
		animalNoise(new Cheetah());
	}
}