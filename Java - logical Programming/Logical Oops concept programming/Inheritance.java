class Inheritance     //main class
{
	public static void main(String args[])
	{
		Son obj = new Son();
		obj.getdata(154, 52);
		obj.disp();
	}
}

class Father             //Super class
{
	int a, b;
	void getdata(int x, int y)
	{
		a=x;
		b=y;
	}
}

class Son extends Father  //sub class
{
	int add()
	{
		int sum = a+b;
		return sum;	
	}
	void disp() {
		System.out.println("A = "+a);
		System.out.println("B = "+b);
		System.out.println("Sum = "+add());
	}
	
}