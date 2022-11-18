import java.util.Scanner;
class employee
{
	String name,address;
	int age;
	long phn_no;
	double salary;
	employee (String n,int a,long phn,String ad,double sal)
	{
		name=n;
		age=a;
		phn_no=phn;
		address=ad;
		salary=sal;
	}
	void printSalary()
	{
		System.out.println("Salary : "+salary);
	}
}

class officer extends employee
{
	String spc;
	officer(String n,int a,long phn,String ad,double sal,String s)
	{
		super(n,a,phn,ad,sal);
		spc=s;
	}
	void display()
	{
		System.out.println("OFFICER DETAILS :");
		System.out.println("NAME :"+name);
		System.out.println("AGE :"+age);
		System.out.println("PHONE NUMBER :"+phn_no);
		System.out.println("ADDRESS :"+address);
		super.printSalary();
		System.out.println("SPECIALISATION :"+spc);
	}
}

class manager extends employee
{
	String dept;
	manager (String n,int a,long phn,String ad,double sal,String d)
	{
		super(n,a,phn,ad,sal);
		dept=d;
	}
	void display()
	{
		System.out.println("MANAGER DETAILS :");
		System.out.println("NAME :"+name);
		System.out.println("AGE :"+age);
		System.out.println("PHONE NUMBER :"+phn_no);
		System.out.println("ADDRESS :"+address);
		super.printSalary();
		System.out.println("DEPARTMENT :"+dept);
	}
}

public class multiple_inheritance
{
public static void main(String[] args)
{
	Scanner sc=new Scanner (System.in);
	Scanner gc=new Scanner (System.in);
	System.out.println("ENTER OFFICER DETAILS :");
	System.out.println("ENTER NAME : ");
	String n=sc.nextLine();
	System.out.println("ENTER AGE : ");
	int a=sc.nextInt();
	System.out.println("ENTER PHONE NUMBER : ");
	long phn=sc.nextLong();
	System.out.println("ENTER ADDRESS : ");
	String ad=gc.nextLine();
	System.out.println("ENTER SALARY : ");
	double sal=sc.nextDouble();
	System.out.println("ENTER SPECIALISATION : ");
	String spc=gc.nextLine();
	System.out.println("");
	Scanner pc=new Scanner (System.in);
	System.out.println("ENTER MANAGER DETAILS :");
	System.out.println("ENTER NAME : ");
	String na=pc.nextLine();
	System.out.println("ENTER AGE : ");
	int ag=pc.nextInt();
	System.out.println("ENTER PHONE NUMBER : ");
	long phno=pc.nextLong();
	Scanner qc=new Scanner (System.in);
	System.out.println("ENTER ADDRESS : ");
	String add=qc.nextLine();
	System.out.println("ENTER DEPARTMENT : ");
	String dept=qc.nextLine();
	System.out.println("");
	officer off = new officer (n,a,phn,ad,sal,spc);
	manager mg=new manager(na,ag,phno,add,sal,dept);
	mg.display();
	System.out.println("");
	off.display();
}
}
