import java.util.Scanner;
class area_method 
{
void area(int r) //SINGLE ARGUMENT FOR AREA OF CIRCLE
{
	System.out.println("AREA OF CIRCLE = "+(3.14*r*r));
}
void area(int l,int b) //TWO ARGUMENTS FOR AREA OF RECTANGLE
{
	System.out.println("AREA OF RECTANGLE = "+(l*b));
}
 void area(int b, int h, float p) //THREE ARGUMENTS FOR AREA OF TRIANGLE
{
	System.out.println("AREA OF TRIANGLE = "+(0.5*b*h));
}
}
public class shapes
{
public static void main(String[] args)
{
	area_method a=new area_method();
	int l,b,r,h,b1;
	float p=(float)0.5;
	Scanner sc=new Scanner(System.in);
	System.out.println("CIRCLE");
	System.out.println("ENTER RADIUS");
	r=sc.nextInt();
	System.out.println("");
	System.out.println("RECTANGLE");
	System.out.println("ENTER LENGTH");
	l=sc.nextInt();
	System.out.println("ENTER BREADTH");
	b=sc.nextInt();
	System.out.println("");
	System.out.println("TRIANGLE");
	System.out.println("ENTER BASE");
	b1=sc.nextInt();
	System.out.println("ENTER HEIGHT");
	h=sc.nextInt();
	System.out.println("");
	a.area(r);
	a.area(l,b);
	a.area(b1,h,p);	
}
}
