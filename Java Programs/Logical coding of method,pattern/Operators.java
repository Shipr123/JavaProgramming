class Operators
{
	public static void main(String args[])
	{
		int a = 0, x=12;
		int b = 10, y=6;
		int g = a + b;
		boolean c = a>x || b<y;
		boolean d = a>x && b<y;
		boolean e = !(a>x);
		System.out.println("Addition :" +g);
		System.out.println("Logical OR :" +c);
		System.out.println("Logical AND :" +d);
		System.out.println("NOT :" +e);
	}
}