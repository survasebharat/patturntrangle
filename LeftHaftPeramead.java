package test;

import java.util.Scanner;

public class LeftHaftPeramead {

	public static void main(String args[])
	{
		int l;
		System.out.println("enter the values");
		Scanner sc=new Scanner(System.in);
		l=sc.nextInt();
		for(int i=1;i<=l;i++)
		{
			for(int j=l-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
	}
}
