interface Shapes
{
	void rotate();
}
class Circle implements Shapes
{
	public void rotate()
	{
		System.out.println("rotate in clockwise direction");
	}
}
class Rectangle implements Shapes
{
	public void rotate()
	{
		System.out.println("rotate in anti - clockwise direction");
	}
}
class Triangle implements Shapes
{
	public void rotate()
	{
		System.out.println("rotate in clockwise direction");
	}
}

class ShapeInterfaceDemo
{
	public static void main(String[] args) 
	{
		Circle c1 = new Circle();
		c1.rotate();
		Rectangle r1 = new Rectangle();
		r1.rotate();
		Triangle t1 = new Triangle();
		t1.rotate();
		
	}
}
