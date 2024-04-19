package test;
import java.util.*;
public class TrangleStarPatturn {

	public static void main(String args[])
	{
		int no;
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		no=sc.nextInt();
		
		for(int i=1;i<=no;i++)
		{
			for(int s=1;s<=no-i;s++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
	
}
