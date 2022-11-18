import java.util.Scanner;
public class Int_String_Input
{
public static void main(String[] args)
{
	System.out.println("Enter the number :");
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	System.out.println("Enter the string :");
	Scanner gc=new Scanner(System.in);
	String y=gc.nextLine();
	System.out.println("Entered number :"+x);
	System.out.println("Entered string :"+y);
}
}