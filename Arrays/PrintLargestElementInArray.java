import java.util.Scanner;
class PrintLargestElementInArray 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");

		int size = sc.nextInt();

		int[] a = new int[size];

		int maxElement = a[0];

		System.out.println("store numbers in an array: ");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Larges element present in array is :");

		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]>maxElement)
			{
				maxElement = a[i];			}
		}
		System.out.println("max element: "+maxElement);
	}
}