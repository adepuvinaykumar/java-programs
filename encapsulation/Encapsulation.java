class  Calender
{
	private int monthNumber;
	public void assign(int monthNumber)
	{
		if(monthNumber>=1&&monthNumber<=12)
		{
			this.monthNumber = monthNumber;
			System.out.println(monthNumber);
		}
		else
		{
			System.out.println(" invalid month number");
		}
	}
}
class Encapsulation
{
	public static void main(String[]args)
	{
		Calender c1 = new Calender();
		c1.assign(12);
	}
}
