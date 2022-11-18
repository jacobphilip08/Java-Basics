import java.util.Scanner;
public class Char_Frequency
{
public static void main(String[] args)
{
	int i,c=0;
	System.out.println("ENTER THE STRING");
	Scanner sc=new Scanner (System.in);
	String str=sc.nextLine(),d="";
	System.out.println("ENTER THE CHARECTER");
	Scanner gc=new Scanner (System.in);
	String ch=gc.nextLine();
	for (i=0;i<str.length();i++)
	{
		d=d+str.charAt(i);
		if (d.equalsIgnoreCase(ch))
		{
			c++;
			d="";
		}
		else
			d="";
			
	}
	System.out.println("FREQUENCY = "+c);
}
}
