abstract class animal
{
	void eat ()
	{
		
	}
}

class spider extends animal
{
	void food ()
	{
		System.out.println("Spider eats insects");
	}
	
	void legs ()
	{
		System.out.println("Spider has eight legs");
	}
}

interface pets
{
	void name();
}

class fish extends animal implements pets
{
	public void name()
	{
		System.out.println("The fish's name is Memo");
	}
	
	public void food ()
	{
		System.out.println("Fish eats plants");
	}
	
	public void legs()
	{
		System.out.println("Fish has no legs");
	}
}

class cat extends animal implements pets
{
	public void name()
	{
		System.out.println("The cat's name is Mimi");
	}
	
	public void food ()
	{
		System.out.println("Cat eats fish");
	}
	
	public void legs()
	{
		System.out.println("Cat has four legs");
	}
}

public class interface_inheritance
{
public static void main(String[] args)
{
spider ob=new spider();
fish ob1=new fish();
cat ob2=new cat();
System.out.println("Spider");
ob.food();
ob.legs();
System.out.println();
System.out.println("Fish");
ob1.name();
ob1.food();
ob1.legs();
System.out.println();
System.out.println("Cat");
ob2.name();
ob2.food();
ob2.legs();
System.out.println();
}
}
