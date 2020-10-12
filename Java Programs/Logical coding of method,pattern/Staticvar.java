//How to access Static Variable

class Staticvar 
{
	public static void main(String args[])
	{
		Test.marks = 10;
		Test.roll = 20;
		System.out.println("Roll = "+Test.roll);
		System.out.println("Marks "+Test.marks);
	}
}

class Test 
{
	static int roll; //static variable
	static int marks; //static variable
}
