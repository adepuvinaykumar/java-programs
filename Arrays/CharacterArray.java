import java.util.Scanner;
class CharacterArray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		char[] c = new char[size];
		System.out.println("enter the array elements");
		for (int i= 0;i<=c.length-1;i++)
		{
			c[i]=sc.next().charAt(0);

		}
			System.out.println("Array elements are : ");

			for (int i=0;i<=c.length-1;i++)
			{
				System.out.println(c[i]);

			}
	}
}
