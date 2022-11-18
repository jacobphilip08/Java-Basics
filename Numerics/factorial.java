import java.util.Scanner;
public class factorial
{
	public static void main(String[] args) 
	{
		int a=1,i=1,n;
		System.out.println("Enter the number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while (i<=n)
		{
			a=a*i;
			i=i+1;
		}
		System.out.println("Factorial="+a);

	}

}