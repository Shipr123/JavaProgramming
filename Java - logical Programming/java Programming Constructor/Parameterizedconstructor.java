// Constructor declaration

class Parameterizedconstructor
{
	public static void main(String args[])
	{
		Pconst obj = new Pconst(10, 23);
	}
}

class Pconst
{
	int a, b;
	int z;
	//instance variable
	Pconst(int x, int y)   //Parameterized constructor 
	{
		a = x;
		b = y;
		z = a+b;
		System.out.println("A :"+a);
		System.out.println("B :"+b);
		System.out.println("Sum :"+z);
		System.out.println("Default constructor invoked");
	}
}