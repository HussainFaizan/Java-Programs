import java.util.*;
class Demo13
{
	public static void main(String []args)
	{
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number you want to table");
		n=sc.nextInt();
		System.out.println("The given number table is"+n);
		for (i=1;i<=10;i++)
		{
	    System.out.println(i*n);
	}
	}
}