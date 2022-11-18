import java.util.Scanner;
public class Palindrome 
{
	public static void main(String[] args)
	{
		int n,reverse=0,digit,num;
		System.out.println("Enter the number : ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		num=n;
		while (n>0)
		{
			digit=n%10;
			reverse=(reverse*10)+digit;
			n=n/10;
		}
		if (reverse==num)
			System.out.println("Pallindrome");
		else
			System.out.println("Not Palindrome");
	}

}
