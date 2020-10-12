class Pattern
{
	public static void main(String args[])
	{
		int i,j;
		for(i=5; i>=1; i--)
		{
			for(j=5; j>=i; j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
}
//
5
54
543
5432
54321

class Pattern
{
	public static void main(String args[])
	{
		int i,j;
		for(i=1; i<=5; i++)
		{
			for(j=1; j<=i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
//
1
12
123
1234
12345
//
class Pattern
{
	public static void main(String args[])
	{
		int i,j;
		for(i=1; i<=5; i++)
		{
			for(j=5; j>=i; j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
}
//
54321
5432
543
54
5

class Pattern
{
	public static void main(String args[])
	{
		int i,j;
		for(i=1; i<=5; i++)
		{
			for(j=1; j<=4; j++)
			{
				System.out.print(i);
			}
			System.out.print("\n");
		}
	}
}
//
1111
2222
3333
4444
5555