class Fibonacci 
{
	public static void main(String[] args) 
	{
		int a=0,b=1,c;
		System.out.println(a);
		System.out.println(b);
		/*using while loop
		while((a+b)<=100){
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;*/
			do{
				c=a+b;
				System.out.println(c);
				a=b;
				b=c;

			}
			while(c<=100);
		
	}
}