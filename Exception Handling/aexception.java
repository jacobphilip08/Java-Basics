import java.io.*;
import java.util.Scanner;
public class aexception
{
	public static void main(String[] args)
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER FIRST NUMBER : ");
		a=sc.nextInt();
		System.out.println("ENTER SECOND NUMBER : ");
		b=sc.nextInt();
		try
		{
			if (b==0)
				throw new ArithmeticException("EXCEPTION HAS OCCURED");
			else
				System.out.println("QUOTIENT = "+a/b);
		} 
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
	}

}
