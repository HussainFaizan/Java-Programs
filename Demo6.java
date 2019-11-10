import java.util.*;
class Demo6
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Year");
		int y=sc.nextInt();
		//Right condition   if(y%4==0&&y%100!=0|| y%400==0)
			if(y%4==0|| y%400==0)
		{
		System.out.println("the above given year IS a leap year");
		}
		else
		{
		System.out.println("the above given year IS not a leap year");
		}
	}
}