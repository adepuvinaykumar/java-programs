import java.util.Scanner;

class EvenArray 
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
		System.out.println("even index array elements are :");
		
		
		for(int i=0;i<=a.length-1;i++)
		{
			if((i%2==0)&&(i!=0))//check only index values
			{
			System.out.println(a[i]);//prints elements of even index values only
			}

			}

	}
}