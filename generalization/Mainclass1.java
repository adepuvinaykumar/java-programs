class Bike1 
{
	public void start() 
	{
		System.out.println("start bike");
	}
}
class HeroHonda extends Bike1
{
}
class Duke extends Bike1
{

}
class Bullet extends Bike1
{

}
class Mainclass1
{
	public static void race(Bike1 b1)//using static method
	{
		b1.start();
	}
	public static void main(String[]args)
	{
		race(new HeroHonda());
		race(new Duke());
		race(new Bullet());
	}
}