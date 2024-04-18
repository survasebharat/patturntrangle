package test;

import java.util.*;
public class Zero_One_Trangle {
	public static void main(String args[])
	{
		int r;
		System.out.println("enter the rows");
		Scanner sc=new Scanner(System.in);
		r=sc.nextInt();
		
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=i;j++)
			{
				int sum=i+j;
				if(sum%2==0)
				{
					System.out.print("1");
				}
				else
				{
					System.out.print("0");
				}
			}
			System.out.println();
		}
		
	}
}
