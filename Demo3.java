import java.util.*;
class Demo3
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int m1,m2,m3,sum;
		float avg;
		System.out.println("Enter First Subject Marks:");
		m1=sc.nextInt();
		System.out.println("Enter Second Subject Marks:");
		m2=sc.nextInt();
		System.out.println("Enter Third Subject Marks:");
		m3=sc.nextInt();
		sum=m1+m2+m3;
		avg=sum/3;
		System.out.println("Sum of all Subject is:"+sum);
		System.out.println("Average of all subject:"+avg);

	}
}