import java.util.Scanner;

public class ODD_EVEN
{
public static void main(String[] args)
{
	System.out.println("Enter the number :");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	if (a%2==0)
		System.out.println("EVEN");
	else
		System.out.println("ODD");
}
}