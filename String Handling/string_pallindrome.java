import java.util.Scanner;
public class string_pallindrome
{
public static void main(String[] args)
{
	int i;
	System.out.println("ENTER THE STRING");
	Scanner sc=new Scanner (System.in);
	String str=sc.nextLine(),rev="";
	for (i=0;i<str.length();i++)
		rev=str.charAt(i)+rev;
	if (rev.equals(str))
		System.out.println("PALINDROME");
	else
		System.out.println("NOT PALINDROME");
}
}
