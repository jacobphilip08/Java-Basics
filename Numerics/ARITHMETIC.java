import java.util.Scanner;

public class ARITHMETIC
{
public static void main(String[] args) 
{
	System.out.println("Enter first number :");
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	System.out.println("Enter second number :");
	Scanner gc=new Scanner(System.in);
	int y=gc.nextInt();
	System.out.println("SUM = "+(x+y));
	System.out.println("DIFFERENCE = "+(x-y));
	System.out.println("PRODUCT = "+(x*y));
	System.out.println("QUOTIENT = "+(x+y));
}
}