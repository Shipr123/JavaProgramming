class Numberreverse
{
	public static void main(String[] args) 
	{
		for (int i = 1234567; i != 0; i = i / 10 )
		{
			System.out.print((i % 10) + ", ");
		}
	}
}
//7, 6, 5, 4, 3, 2, 1, 