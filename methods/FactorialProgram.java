class FactorialProgram
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		//String f=factorial(5);
		//System.out.println(f); OR
		System.out.println("factoial is"+factorial(5));
	}
	public static int factorial(int num){
		int fact=1;
		for(int i=1;i<=num;i++){
			fact=fact*i;
		}
			return (fact);
			
		
		
		
		
		
		
	}
}