import java.util.Scanner;
import java.io.*;
public class exception
{
public static void main(String[] args) 
{
	int a,b,d;
	Scanner sc=new Scanner(System.in);
	while(true)
	{
		System.out.println("ENTER FIRST NUMBER : ");
		a=sc.nextInt();
		System.out.println("ENTER SECOND NUMBER : ");
		b=sc.nextInt();
		try
		{
			System.out.println("QUOTIENT ="+a/b);
		} 
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally 
		{
			System.out.println("PROGRAM ENDED");
		}
		System.out.println("");
		System.out.println("DO YOU WISH TO CONTINUE ?");
		String n=sc.next();
		String p="n";
		if (n.equalsIgnoreCase(p))
		{
			System.out.println("PROGRAM ENDING");
			System.out.println("");
			break;
		}
		else 
		{
			System.out.println("");
			continue;
		}
	}
}
}
