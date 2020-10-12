class Hierarhical
{
	public static void main(String args[])
	{
		B objb = new B();
		C objc = new C();
		objb.getdata(10, 5);  //Calling method of super class
		objb.disp();          //Calling method of sub class B
		
		objc.getdata(10, 5);  //Calling method of super class
		objc.disp(); 		  //Calling method of sub class C
		
	}
}

class A   			//Super class
{
	int a,b;
	void getdata(int x, int y)
	{
		a = x;
		b = y;
	}
}

class B extends A
{
	int add()
	{
		return (a+b);
		
	}
	void disp()
	{
		System.out.println("A :" +a);
		System.out.println("B :" +b);
		System.out.println("Addition :" +add());
	}
}

class C extends A
{
	int mult()
	{
		return (a*b);
		
	}
	void disp()
	{
		System.out.println("A :" +a);
		System.out.println("B :" +b);
		System.out.println("Multiplication :" +mult());
	}	
}