class Bike 
{
	public void start() 
	{
		System.out.println("start bike");
	}
}
class HeroHonda extends Bike
{
}
class Duke extends Bike
{

}
class Bullet extends Bike
{

}
class Mainclass
{
	public  void race(Bike b1)//using non static method
	{
		b1.start();
	}
	public static void main(String[]args)
	{
		Mainclass m = new Mainclass();
		m.race(new HeroHonda());
		m.race(new Duke());
		m.race(new Bullet());
	}
}