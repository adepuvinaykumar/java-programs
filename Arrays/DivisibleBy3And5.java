import java.util.Scanner;
class DivisibleBy3And5 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");

		int size = sc.nextInt();

		int[] a = new int[size];

		System.out.println("enter numbers to store in an array: ");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}

		System.out.println("the numbers which are divisible by 3&5 : ");

		for(int i=0;i<=a.length-1;i++)
		{
			if((a[i]%3==0)&&(a[i]%5==0))
			{
				System.out.println(a[i]);
			}
		}
	}
}