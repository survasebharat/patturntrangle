package test;
//number incresing reverse perimead
import java.util.*;
public class Demo2 {

	public static void main(String args[])
	{
		int a;
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		
		for(int i=a;i>=1;i--)
		{
	
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+ " ");
			}
			System.out.println();
			
		}
		
		
	}
}
