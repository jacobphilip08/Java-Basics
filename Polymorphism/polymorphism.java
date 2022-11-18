abstract class shape
{
	void NumberofSides()
	{
		
	}
}
class rectangle extends shape
{
	void NumberofSides()
	{
		System.out.println("I AM RECTANGLE, I HAVE  4 SIDES");
	}
}
class triangle extends shape
{
	void NumberofSides()
	{
		System.out.println("I AM TRIANLGE, I HAVE 3 SIDES");
	}
}
class hexagon extends shape
{
	void NumberofSides()
	{
		System.out.println("I AM HEXAGON, I HAVE 6 SIDES");
	}
}
public class polymorphism 
{
public static void main(String[] args) 
{
	rectangle ob=new rectangle();
	triangle ob1=new triangle();
	hexagon ob2=new hexagon();
	ob.NumberofSides();
	ob1.NumberofSides();
	ob2.NumberofSides();
}
}
