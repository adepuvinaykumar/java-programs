import java.util.Scanner;
class  Scannerexample{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		System.out.println("enter decimal");
		double d = sc.nextDouble();
		System.out.println("entar a character");
		char c = sc.next().charAt(0);
		System.out.println("enter  a string");
		String s = sc.next();
		System.out.println("enter a boolean");
		boolean b = sc.nextBoolean();

		System.out.println("Addition of a+d is: "+a+d);
		System.out.println("adding a char and string: "+c+s);
		System.out.println("boolean value is:"+b);

		}
}
