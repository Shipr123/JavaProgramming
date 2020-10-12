class Methodoverriding
{
	public static void main(String args[])
	{
		D objd = new D();
		E obje = new E();
		F objf = new F();
		objd.disp();
		obje.disp();
		objf.disp();
		
}
}

class D
{
	int a = 100;
	void disp()
	{
		System.out.println("A :"+a);
	}
}

class E extends D
{
	int b = 300;
	void disp()
	{
		int sum = a+b;
		System.out.println("Sub class E");
		System.out.println("Sum :" +sum);
		
	}
}

class F extends D
{
	int c = 400;
	void disp()
	{
		int mul = a*c;
		System.out.println("Sub class F :");
		System.out.println("Mul :" +mul);
	}
}