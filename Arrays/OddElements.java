import java.util.Scanner;
class OddElements 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array size : ");

		int size = sc.nextInt();

		int[] a = new int[size];
		int count = 0;
		System.out.println("enter array elements: ");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}

		System.out.println("The count of odd elements in  array are : ");

		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2!=0)
			{
				count++;
			}
		}
		System.out.println(count);

	}
}
