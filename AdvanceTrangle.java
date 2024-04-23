
public class AdvanceTrangle {

	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++)
		{
			for(int k=1;k<=4-i;k++)
			{
				System.out.print(" ");
			}
			for( int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			if(i==2)
			{
				for(int l=2;l<=i;l++)
				{
					System.out.println(l);
				}
			}
		}

	}

}
