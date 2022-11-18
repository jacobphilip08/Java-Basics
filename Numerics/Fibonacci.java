import java.util.Scanner;
public class Fibonacci
{
	public static void main(String[] args) 
	{
		int a=0,b=1,c,n;
		System.out.println("Enter the limit :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("The series till "+n+" numbers : " );
		System.out.println(a);
		System.out.println(b);
		n=n-2;
		while (n>0)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			n=n-1;
		}	
	
	}

}
