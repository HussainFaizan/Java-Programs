import java.util.*;
class Demo7
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter Any two digit number");
		int n=sc.nextInt();
		
		int a=n/100;
		int b=((n%100)/10);
		int c=n%10;
		System.out.println(+a);
		System.out.println(+b);
		System.out.println(+c);
		int sum=a+b+c;
		System.out.println(+sum);
		
	}
}