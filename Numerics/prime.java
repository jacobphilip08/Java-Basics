import java.util.Scanner;
public class prime
{
	public static void main(String[] args) 
	{
		int i,n;
		System.out.println("Enter the number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if (n==2)
			System.out.println(n+" is prime");
		else
			for (i=2;i<=n;i++)
				if (i==n)
				{
					System.out.println(n+" is  prime");
                    break;
				}
				else if (n%i==0)
				{
					System.out.println(n+" is not prime");
                    break;
				}
	}

}