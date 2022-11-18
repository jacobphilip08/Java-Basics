import java.util.Scanner;
public class matrix_multiplication
{
public static void main(String[] args)
{
int r1,r2,c1,c2;
System.out.println("MATRIX 1 :");
System.out.println("ENTER NO. OF ROWS ");
Scanner sc =new Scanner (System.in);
r1=sc.nextInt();
System.out.println("ENTER NO. OF COLUMNS ");
c1=sc.nextInt();
int [][]m1= new int [r1][c1];
System.out.println("");
for (int i=0;i<r1;i++)
{
	System.out.println("ENTER ROW "+(i+1)+" ELEMENTS");
	for (int j=0;j<c1;j++)
	{
		int n = sc.nextInt();
		m1[i][j]=n;
	}
	System.out.println("");
}
System.out.println("");
System.out.println("MATRIX 2 :");
System.out.println("ENTER NO. OF ROWS ");
r2=sc.nextInt();
System.out.println("ENTER NO. OF COLUMNS ");
c2=sc.nextInt();
int [][]m2= new int [r2][c2];
int [][]m3= new int [r1][c2];
System.out.println("");
for (int i=0;i<r1;i++)
{
	System.out.println("ENTER ROW "+(i+1)+" ELEMENTS");
	for (int j=0;j<c1;j++)
	{
		int n = sc.nextInt();
		m2[i][j]=n;
	}
	System.out.println("");
}
if (c1!=r2)
	System.out.println("MULTIPLICATION NOT POSSIBLE");
else
{
	for (int i=0;i<r2;i++)
	{
		for (int j=0;j<c2;j++)
		{
			for (int k=0;k<c1;k++)
			{
				m3[i][j]=m3[i][j]+m1[i][k]*m2[k][j];
			}
		}
	}
}
System.out.println("PRODUCT MATRIX :");
for (int i=0;i<r1;i++)
{
	for (int j=0;j<c1;j++)
		System.out.print(m3[i][j]);
	System.out.println("");
}
}
}
