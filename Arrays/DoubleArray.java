import java.util.Scanner;
class DoubleArray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();

		double[] d = new double[size];
		System.out.println("Enter array elements : ");
			 
		for(int i=0;i<=d.length-1;i++)
		{
			d[i]=sc.nextDouble();
		}


		System.out.println("array elements are :");

		for(int i=0;i<=d.length-1;i++)
		{
			System.out.println(d[i]);

		}
	}

}
