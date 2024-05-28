import java.util.Scanner;
class  StringContainsChar
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s = sc.next();
		System.out.println("enter a character : ");
		char c1 = sc.next().charAt(0);
		int count = 0;
		for(int i=0;i<=s.length()-1;i++)
		{
			char c2 = s.charAt(i);
			if(c2 == c1)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
