package test;
import java.util.*;
public class SquarePatturn {

	public static void main(String args[])
	{
		int a;
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		
		for(int i=1;i<=a;i++)
		{
			for(int  j=1;j<=a;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}
