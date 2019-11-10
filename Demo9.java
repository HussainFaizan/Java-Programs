import java.util.*;
class Demo9
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter Any three digit number");
		int n=sc.nextInt();
		
		int a=n/100;
		int b=((n%100)/10);
		int c=n%10;
		int d=a*a*a+b*b*b+c*c*c;
		if(n==d)
		{
			System.out.println("The given Number is ArmStrong Number");
		}
		else
			{
			System.out.println("The given Number is not ArmStrong Number");
		}
	}
}