package test;
//number changing perymead
public class demo3 {
	
	public static void main(String args[])
	{
		int s=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+ s++);
			}
			System.out.println(" ");
		}
	}

}
