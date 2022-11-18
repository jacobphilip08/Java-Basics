import java.util.Scanner;
class employee
{
	int sal,da,ta,Salary;
	void calcSalary(int sal,int da,int ta)
	{
		Salary=sal+da+ta;
		System.out.println("Employee Salary ="+Salary);
	}
	void display()
	{
		System.out.println("CLASS NAME IS EMPLOYEE");
	}
}
class engineer extends employee
{
	void calcSalary(int sal,int ta,int da)
	{
		super.calcSalary(sal,ta,da);
		Salary=2*Salary;
		System.out.println("Engineer Salary = "+Salary);
	}
	void display()
	{
		super.display();
		System.out.println("CLASS NAME IS ENGINEER");
	}
}
public class inheritence
{
public static void main(String[] args)
{
	int sal,da,ta;
	System.out.println("ENTER BASIC SALARY");
	Scanner sc=new Scanner(System.in);
	sal=sc.nextInt();
	System.out.println("ENTER DA");
	da=sc.nextInt();
	System.out.println("ENTER TA");
	ta=sc.nextInt();
	employee ob=new engineer();
	ob.calcSalary(sal,ta,da);
	ob.display();
}
}
