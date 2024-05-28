import java.util.Scanner;
class VowelsInChar 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter array size : ");
		int size = scan.nextInt();	
		char[] c = new char[size];

		System.out.println("Enter the characaters to store in an array :");
		for(int i = 0;i<=c.length-1;i++)
		{
			c[i] = scan.next().charAt(0);
		}
		System.out.println("vowel characters are : ");
		for(int i = 0;i<=c.length-1;i++)
		{
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'||c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U')
			{
			System.out.println(c[i]);
			}
		}
	}
}
