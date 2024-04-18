package test;
import java.util.*;
public class RigthLeftTrangle {

	public static void main(String args[])
	{
		int x;
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		
		for(int i=x;i<=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println( );
		}
		
	}
}
