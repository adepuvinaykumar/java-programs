import java.util.Scanner;
class ReverseArray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		String[] c = new String[size];
		System.out.println("enter the array elements");
		for (int i= 0;i<=c.length-1;i++)
		{
			c[i]=sc.next();

		}
		System.out.println("reversing order of array elements : ");

		for(int i=c.length-1;i>=0;i--)
		{
		System.out.println(c[i]);
		}
	}
}