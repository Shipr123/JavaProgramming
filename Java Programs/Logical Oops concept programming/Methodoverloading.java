class Methodoverloading
{
	public static void main(String args[])
	{
		Addition obj = new Addition();
		obj.disp(3, 90.9f);
		obj.disp(34, 43);
	}
}

class Addition
{
	void disp(int a, int b)
	{
		int x = a, y = b;
		int z = x+y;
		System.out.println("Int Addition :"+z);
	}
	void disp(int a, float b)
	{
		int x = a;
		float y = b;
		float z = x+y;
		System.out.println("float Multiplication :"+z);
	}
}

No of paramenters can be dofferent in two function 
add(int a, int b) {}
add(int a){}