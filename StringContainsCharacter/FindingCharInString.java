import java.util.Scanner;
class  FindingCharInString
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.next();
		System.out.println("Enter a character : ");
		char c1 = sc.next().charAt(0);
		boolean isPresent = false;
	for(int i=0;i<=s.length()-1;i++)
		{
			char c2=s.charAt(i);
			if(c2 == c1)
			{
				isPresent = true;
				break;
			}

	}
	if(isPresent == true)
		{
			System.out.println("The character is present in a given string");
			
			}
			else
		{
				System.out.println("The character is not present in  a given string");
			}
	}
}
