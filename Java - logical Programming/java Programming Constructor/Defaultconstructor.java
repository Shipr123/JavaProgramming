// Constructor declaration

class Defaultconstructor
{
	public static void main(String args[])
	{
		Const obj = new Const(10, 23);
	}
}

class Const
{
	int a, b;
	//instance variable
	Const(int x, int y)   //Default constructor - (no parameter)
	{
		a = x;
		b = y;
		System.out.println("A :"+a);
		System.out.println("B :"+b);
		System.out.println("Default constructor invoked");
	}
}