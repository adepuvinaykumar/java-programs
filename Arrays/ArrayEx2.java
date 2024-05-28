import java.util.Scanner;

class ArrayEx2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = sc.nextInt();
	
		int [] a= new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<=a.length-1;i++)//store array elements
		{
			a[i] = sc.nextInt();
		}
		System.out.println("array elements are :");
		
		for(int i=0;i<=a.length-1;i++)//access the array elements
		{
			System.out.println(a[i]);
		}
	}
}
