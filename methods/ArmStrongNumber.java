class  ArmStrongNumber
{
	public static void main(String[] args) 
	{
	int num=153,temp=num,sum=0,rem;
	while(num>0){
		rem=num%10;
		sum=sum+(rem*rem*rem);
		num/=10;
	}
	if(temp==sum){
		System.out.println(temp+" Is an armstrong number");
	}
		else{
			System.out.println(temp+" is not armstrong number");
		}
	}
}