import java.util.Scanner;
class Pattern
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Value of N : ");
		int n = s.nextInt();

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			int x=1;

			for(int k=1;k<=i;k++)
			{	
				System.out.print(x+" ");
				x=x*(i-k)/k;				
			}

			System.out.println();
		}
	}
}
