import java.util.*;
class Demo4
{
	public static void main(String []args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Any Three Numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b)
		{
			System.out.println("A is Grater");
		}
		if(b>c)
		{
			System.out.println("B is Grater");
		}
		if(c>a)
		{
			System.out.println("C is Grater");
		}
	}
}